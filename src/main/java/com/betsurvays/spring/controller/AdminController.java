package com.betsurvays.spring.controller;

import com.betsurvays.spring.model.Admin;
import com.betsurvays.spring.model.Palinsesto;
import com.betsurvays.spring.service.PalinsestoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Lorenzo on 18/06/2017.
 */
@Controller
public class AdminController {

    private PalinsestoService palinsestoService;

    @Autowired(required=true)
    @Qualifier(value="palinsestoService")
    public void setPalinsestoService(PalinsestoService ps){
        this.palinsestoService = ps;
    }


    @RequestMapping(value = "/palinsesti", method = RequestMethod.GET)
    public String listPalinsesti(Model model) {
        model.addAttribute("palinsesto", new Palinsesto());
        model.addAttribute("listPalinsesti", this.palinsestoService.listPalinsesti());
        return "palinsesto";
    }


    //For add and update person both
    @RequestMapping(value= "/palinsesto/add", method = RequestMethod.POST)
    public String addPalinsesto(@ModelAttribute("palinsesto") Palinsesto p){
        if(p.getId() == 0)
            this.palinsestoService.addPalinsesto(p);
        else
            this.palinsestoService.updatePalinsesto(p);

        return "redirect:/palinsesti";
    }



    @RequestMapping("/remove/{id}")
    public String removePalinsesto(@PathVariable("id") int id){
        this.palinsestoService.removePalinsesto(id);
        return "redirect:/palinsesti";
    }

    @RequestMapping("/edit/{id}")
    public String editPalinsesto(@PathVariable("id") int id, Model model){
        model.addAttribute("palinsesto", this.palinsestoService.getPalinsestoById(id));
        model.addAttribute("listPalinsesti", this.palinsestoService.listPalinsesti());
        return "palinsesto";
    }

}
