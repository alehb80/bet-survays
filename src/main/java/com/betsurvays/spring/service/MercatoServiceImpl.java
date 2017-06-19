package com.betsurvays.spring.service;

import com.betsurvays.spring.dao.MercatoDAO;
import com.betsurvays.spring.model.Mercato;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by alessio on 19/06/17.
 */

@Service
public class MercatoServiceImpl implements MercatoService {

    private MercatoDAO mercatoDAO;

    public void setMercatoDAO(MercatoDAO mercatoDAO) {
        this.mercatoDAO = mercatoDAO;
    }

    @Override
    @Transactional
    public void addMercato(Mercato m) {
        this.mercatoDAO.addMercato(m);
    }

    @Override
    @Transactional
    public void updateMercato(Mercato m) {
        this.mercatoDAO.updateMercato(m);
    }

    @Override
    @Transactional
    public List<Mercato> listMercati() {
        return this.mercatoDAO.listMercati();
    }

    @Override
    @Transactional
    public Mercato getMercatoById(int id) {
        return this.mercatoDAO.getMercatoById(id);
    }

    @Override
    @Transactional
    public void removeMercato(int id) {
        this.mercatoDAO.removeMercato(id);
    }

}
