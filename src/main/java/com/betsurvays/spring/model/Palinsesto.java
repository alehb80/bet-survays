package com.betsurvays.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity bean with JPA annotations
 * Hibernate provides JPA implementation
 * @author pankaj
 *
 */
@Entity
@Table(name="palinsesto")
public class Palinsesto {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	@Column(name="nomepalinsesto")
	private String nomepalinsesto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomepalinsesto() {
		return nomepalinsesto;
	}

	public void setNomepalinsesto(String nomepalinsesto) {
		this.nomepalinsesto = nomepalinsesto;
	}

	@Override
	public String toString(){
		return "id="+id+", name="+nomepalinsesto;
	}
}
