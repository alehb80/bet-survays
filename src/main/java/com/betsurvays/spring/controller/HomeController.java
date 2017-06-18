package com.betsurvays.spring.controller;

import com.betsurvays.spring.model.Admin;
import com.betsurvays.spring.model.Palinsesto;
import com.betsurvays.spring.service.PalinsestoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Lorenzo on 18/06/2017.
 */

@Controller
public class HomeController {

    private PalinsestoService palinsestoService;

    @Autowired(required=true)
    @Qualifier(value="palinsestoService")
    public void setPalinsestoService(PalinsestoService ps){
        this.palinsestoService = ps;
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String listPalinsesti(Model model) {
        model.addAttribute("listPalinsesti", this.palinsestoService.listPalinsesti());
        return "home";
    }

    @RequestMapping(value="/loginadmin", method=RequestMethod.GET)
    public ModelAndView mostraForm(){
        Admin admin = new Admin();
        return new ModelAndView("loginadmin","admin",admin);
    }

}
