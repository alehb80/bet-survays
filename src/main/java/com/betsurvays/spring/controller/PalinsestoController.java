package com.betsurvays.spring.controller;

import com.betsurvays.spring.model.Palinsesto;
import com.betsurvays.spring.model.Partita;
import com.betsurvays.spring.service.PalinsestoService;
import com.betsurvays.spring.service.PartitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Lorenzo on 18/06/2017.
 */

@Controller
public class PalinsestoController {

    private PartitaService partitaService;

    private PalinsestoService palinsestoService;

    @Autowired(required=true)
    @Qualifier(value="partitaService")
    public void setPartitaService(PartitaService ps){
        this.partitaService = ps;
    }

    @Autowired(required=true)
    @Qualifier(value="palinsestoService")
    public void setPalinsestoService(PalinsestoService ps){
        this.palinsestoService = ps;
    }

    @RequestMapping(value = "/partite/{id}", method = RequestMethod.GET)
    public String listPartite(@PathVariable("id") int id, Model model) {
        Palinsesto p = this.palinsestoService.getPalinsestoById(id);
        model.addAttribute("partita", new Partita());
        model.addAttribute("listPartite", this.partitaService.findByPalinsesto(p));
        return "partita";
    }

}
