package my.clinic.myclinic.controllers;

import my.clinic.myclinic.domain.Vet;
import my.clinic.myclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Set;

@RequestMapping()
@Controller()
public class VetsController {
private final VetService vetService;

    public VetsController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"/vets", "/vets/index", "/vets/index.html", "/vets.html"})
    public String listVets(Model model){
        model.addAttribute("vets",vetService.findAll());
        return "vets/index";
    }

    @RequestMapping("/find")
    public String findOwner(){
        return "notimplemented";
    }

    @GetMapping(value = "/api/vets")
    public @ResponseBody Set<Vet> listAllVets(){
        return vetService.findAll();
    }
}
