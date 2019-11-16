package com.ambroziepaval.sfgpetclinic.controllers;

import com.ambroziepaval.sfgpetclinic.model.Owner;
import com.ambroziepaval.sfgpetclinic.model.Pet;
import com.ambroziepaval.sfgpetclinic.model.Visit;
import com.ambroziepaval.sfgpetclinic.services.OwnerService;
import com.ambroziepaval.sfgpetclinic.services.PetService;
import com.ambroziepaval.sfgpetclinic.services.VisitService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Map;

@Controller
@RequestMapping("/owners/{ownerId}/pets/{petId}")
@RequiredArgsConstructor
public class VisitController {

    private final OwnerService ownerService;
    private final VisitService visitService;
    private final PetService petService;

    @ModelAttribute("owner")
    public Owner findOwner(@PathVariable("ownerId") Long ownerId) {
        return ownerService.findById(ownerId);
    }

    /**
     * Called before each and every @RequestMapping annotated method.
     * 2 goals:
     * - Make sure we always have fresh data
     * - Since we do not use the session scope, make sure that Pet object always has an id
     * (Even though id is not part of the form fields)
     *
     * @param petId the Pet ID
     * @return Pet
     */
    @ModelAttribute("visit")
    public Visit loadPetWithVisit(@PathVariable("petId") Long petId, Map<String, Object> model) {
        Pet pet = petService.findById(petId);
        model.put("pet", pet);

        Visit visit = new Visit();
        pet.getVisits().add(visit);
        visit.setPet(pet);
        return visit;
    }

    // Spring MVC calls method loadPetWithVisit(...) before initNewVisitForm is called
    @GetMapping("/visits/new")
    public String initNewVisitForm(@PathVariable("petId") Long petId, Map<String, Object> model) {
        return "pets/createOrUpdateVisitForm";
    }

    // Spring MVC calls method loadPetWithVisit(...) before processNewVisitForm is called
    @PostMapping("/visits/new")
    public String processNewVisitForm(@Valid Visit visit, Owner owner, BindingResult result) {

        if (result.hasErrors()) {
            return "pets/createOrUpdateVisitForm";
        } else {
            visitService.save(visit);
            return "redirect:/owners/" + owner.getId();
        }
    }
}
