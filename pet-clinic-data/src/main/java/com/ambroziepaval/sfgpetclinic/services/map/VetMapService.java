package com.ambroziepaval.sfgpetclinic.services.map;

import com.ambroziepaval.sfgpetclinic.model.Specialty;
import com.ambroziepaval.sfgpetclinic.model.Vet;
import com.ambroziepaval.sfgpetclinic.services.SpecialtyService;
import com.ambroziepaval.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by Ambrozie on 09/10/2018
 */
@Service
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {

    private SpecialtyService specialtyService;

    public VetMapService(SpecialtyService specialtyService) {
        this.specialtyService = specialtyService;
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet vet) {

        vet.getSpecialties().forEach(specialty -> {
            if (specialty.getId() == null) {
                Specialty savedSpecialty = specialtyService.save(specialty);
                specialty.setId(savedSpecialty.getId());
            }
        });

        return super.save(vet);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet vet) {
        super.delete(vet);
    }
}
