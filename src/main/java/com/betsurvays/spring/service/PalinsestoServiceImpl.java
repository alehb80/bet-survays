package com.betsurvays.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.betsurvays.spring.dao.PalinsestoDAO;
import com.betsurvays.spring.model.Palinsesto;

@Service
public class PalinsestoServiceImpl implements PalinsestoService {
	
	private PalinsestoDAO palinsestoDAO;

	public void setPalinsestoDAO(PalinsestoDAO palinsestoDAO) {
		this.palinsestoDAO = palinsestoDAO;
	}

	@Override
	@Transactional
	public void addPalinsesto(Palinsesto p) {
		this.palinsestoDAO.addPalinsesto(p);
	}

	@Override
	@Transactional
	public void updatePalinsesto(Palinsesto p) {
		this.palinsestoDAO.updatePalinsesto(p);
	}

	@Override
	@Transactional
	public List<Palinsesto> listPalinsesti() {
		return this.palinsestoDAO.listPalinsesti();
	}

	@Override
	@Transactional
	public Palinsesto getPalinsestoById(int id) {
		return this.palinsestoDAO.getPalinsestoById(id);
	}

	@Override
	@Transactional
	public void removePalinsesto(int id) {
		this.palinsestoDAO.removePalinsesto(id);
	}

}
