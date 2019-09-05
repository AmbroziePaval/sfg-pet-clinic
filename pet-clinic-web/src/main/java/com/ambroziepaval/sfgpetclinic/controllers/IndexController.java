package com.ambroziepaval.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Ambrozie on 09/10/2018
 */
@Controller
public class IndexController {

    @GetMapping({"", "/", "index", "index.html"})
    public String index() {

        return "index";
    }

    @GetMapping("/oups")
    public String oups() {
        return "notimplemented";
    }
}
