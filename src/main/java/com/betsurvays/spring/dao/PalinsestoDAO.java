package com.betsurvays.spring.dao;

import java.util.List;

import com.betsurvays.spring.model.Palinsesto;



public interface PalinsestoDAO {

	public void addPalinsesto(Palinsesto p);
	public void updatePalinsesto(Palinsesto p);
	public List<Palinsesto> listPalinsesti();
	public Palinsesto getPalinsestoById(int id);
	public void removePalinsesto(int id);
}
