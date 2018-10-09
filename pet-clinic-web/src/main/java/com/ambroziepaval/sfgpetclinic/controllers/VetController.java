package com.ambroziepaval.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Ambrozie on 09/10/2018
 */
@Controller
public class VetController {

    @RequestMapping({"/vets", "/vets/", "/vets/index", "/vets/index.html"})
    public String listVets() {

        return "vets/index";
    }
}
