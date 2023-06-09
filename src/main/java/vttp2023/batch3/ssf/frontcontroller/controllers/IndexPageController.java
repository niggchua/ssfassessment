package vttp2023.batch3.ssf.frontcontroller.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import vttp2023.batch3.ssf.frontcontroller.model.Login;


@Controller
public class IndexPageController {

 
    @GetMapping(path="/")
    public String showLandingPage(Model m){

        m.addAttribute("login", new Login());
        return "view0";
    }
}


    

