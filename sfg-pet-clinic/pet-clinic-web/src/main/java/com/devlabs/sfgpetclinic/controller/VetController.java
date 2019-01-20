package com.devlabs.sfgpetclinic.controller;

import com.devlabs.sfgpetclinic.service.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    private VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"/vets","/vets/vet-list","/vets/index", "/vets/index.html","vets.html"})
    public String listOfVets(Model model){
        model.addAttribute("vets", vetService.findAll());
        return "vets/vet-list";
    }
}
