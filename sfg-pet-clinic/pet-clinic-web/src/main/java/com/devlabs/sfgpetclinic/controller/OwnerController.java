package com.devlabs.sfgpetclinic.controller;

import com.devlabs.sfgpetclinic.service.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"","/","/owners","/index"})
    public String listOwners(Model model ){
        model.addAttribute("owners", ownerService.findAll());
        return "owners/owners";
    }

    @RequestMapping({"/find"})
    public String findOwners(){
        return "notImplemented";
    }
}
