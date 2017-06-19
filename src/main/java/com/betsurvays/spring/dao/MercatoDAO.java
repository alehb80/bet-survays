package com.betsurvays.spring.dao;

import com.betsurvays.spring.model.Mercato;

import java.util.List;

/**
 * Created by alessio on 19/06/17.
 */
public interface MercatoDAO {
    public void addMercato(Mercato m);
    public void updateMercato(Mercato m);
    public List<Mercato> listMercati();
    public Mercato getMercatoById(int id);
    public void removeMercato(int id);
}
