package com.betsurvays.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.betsurvays.spring.model.Palinsesto;



@Repository
public class PalinsestoDAOImpl implements PalinsestoDAO {
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	@Override
	public void addPalinsesto(Palinsesto p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(p);
		
	}

	@Override
	public void updatePalinsesto(Palinsesto p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(p);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Palinsesto> listPalinsesti() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Palinsesto> palinsestiList = session.createQuery("from Palinsesto").list();
		
		return palinsestiList;
	}

	@Override
	public Palinsesto getPalinsestoById(int id) {
		Session session = this.sessionFactory.getCurrentSession();		
		Palinsesto p = (Palinsesto) session.load(Palinsesto.class, new Integer(id));
		
		return p;
	}

	@Override
	public void removePalinsesto(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Palinsesto p = (Palinsesto)session.load(Palinsesto.class, new Integer(id));
		if(null != p){
			session.delete(p);
		}
		
	}

}
