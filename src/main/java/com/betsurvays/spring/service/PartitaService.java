package com.betsurvays.spring.service;

import com.betsurvays.spring.model.Palinsesto;
import com.betsurvays.spring.model.Partita;

import java.util.List;

/**
 * Created by Lorenzo on 18/06/2017.
 */
public interface PartitaService {
    public void addPartita(Partita p);
    public void updatePartita(Partita p);
    public List<Partita> listPartite();
    public Partita getPartitaById(int id);
    public void removePartita(int id);
    public List<Partita> findByPalinsesto(Palinsesto p);
}
