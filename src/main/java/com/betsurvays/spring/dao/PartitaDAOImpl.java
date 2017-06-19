package com.betsurvays.spring.dao;

import com.betsurvays.spring.model.Palinsesto;
import com.betsurvays.spring.model.Partita;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Lorenzo on 18/06/2017.
 */
@Repository
public class PartitaDAOImpl implements PartitaDAO {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sf){
        this.sessionFactory = sf;
    }

    @Override
    public void addPartita(Partita p) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(p);
    }

    @Override
    public void updatePartita(Partita p) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(p);
    }

    @Override
    public List<Partita> listPartite() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Partita> partiteList = session.createQuery("from Partita").list();
        return partiteList;
    }

    @Override
    public Partita getPartitaById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Partita p = (Partita) session.load(Partita.class, new Integer(id));
        return p;
    }

    @Override
    public void removePartita(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Partita p = (Partita)session.load(Partita.class, new Integer(id));
        if(null != p){
            session.delete(p);
        }
    }

    @Override
    public List<Partita> findByPalinsesto(Palinsesto p) {
        Session session = this.sessionFactory.getCurrentSession();
        List<Partita> partiteList = session.createQuery("from Partita where palinsesto_id = " + p.getId()).list();
        return partiteList;
    }

}
