package com.eazybytes.eazyschool.controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping(value={"","/","home"})
    public String displayHomePage(Model model)
    {
        model.addAttribute("username","Abd");
        return "home.html";

    }

}
