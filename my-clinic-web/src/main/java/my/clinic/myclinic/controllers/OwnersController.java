package my.clinic.myclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@RequestMapping("/owners")
@Controller
public class OwnersController {

    @RequestMapping({"","/index","/index.html"})
    public String listOwnerss(){
        return "owners/index";
    }
}
