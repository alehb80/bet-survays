package com.betsurvays.spring.dao;

import com.betsurvays.spring.model.Mercato;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by alessio on 19/06/17.
 */

@Repository
public class MercatoDAOImpl implements MercatoDAO {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sf){
        this.sessionFactory = sf;
    }

    @Override
    public void addMercato(Mercato m) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(m);
    }

    @Override
    public void updateMercato(Mercato m) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(m);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Mercato> listMercati() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Mercato> mercatiList = session.createQuery("from Mercato").list();
        return mercatiList;
    }

    @Override
    public Mercato getMercatoById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Mercato m = (Mercato) session.load(Mercato.class, new Integer(id));
        return m;
    }

    @Override
    public void removeMercato(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Mercato m = (Mercato)session.load(Mercato.class, new Integer(id));
        if(null != m){
            session.delete(m);
        }
    }

}
