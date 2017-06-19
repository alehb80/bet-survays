package com.betsurvays.spring.service;

import com.betsurvays.spring.dao.PartitaDAO;
import com.betsurvays.spring.model.Palinsesto;
import com.betsurvays.spring.model.Partita;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Lorenzo on 18/06/2017.
 */

@Service
public class PartitaServiceImpl implements PartitaService {

    private PartitaDAO partitaDAO;

    public void setPartitaDAO(PartitaDAO partitaDAO) {
        this.partitaDAO = partitaDAO;
    }

    @Override
    @Transactional
    public void addPartita(Partita p) {
        this.partitaDAO.addPartita(p);
    }

    @Override
    @Transactional
    public void updatePartita(Partita p) {
        this.partitaDAO.updatePartita(p);
    }

    @Override
    @Transactional
    public List<Partita> listPartite() {
        return this.partitaDAO.listPartite();
    }

    @Override
    @Transactional
    public Partita getPartitaById(int id) {
        return this.partitaDAO.getPartitaById(id);
    }

    @Override
    @Transactional
    public void removePartita(int id) {
        this.partitaDAO.removePartita(id);
    }

    @Override
    @Transactional
    public List<Partita> findByPalinsesto(Palinsesto p) {
        return this.partitaDAO.findByPalinsesto(p);
    }

}
