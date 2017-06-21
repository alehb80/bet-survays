package com.betsurvays.spring.model;

import org.hibernate.annotations.Proxy;

import javax.persistence.*;
import java.util.List;

/**
 * Entity bean with JPA annotations
 * Hibernate provides JPA implementation
 * @author pankaj
 *
 */
@Entity
@Table(name="palinsesto")
@Proxy(lazy = false)
public class Palinsesto {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="nomepalinsesto")
	private String nomepalinsesto;

	@OneToMany(mappedBy = "palinsesto", fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
	private List<Partita> partite;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomepalinsesto() {
		return nomepalinsesto;
	}

	public void setNomepalinsesto(String nomepalinsesto) {
		this.nomepalinsesto = nomepalinsesto;
	}

	public List<Partita> getPartite() {
		return partite;
	}

	public void setPartite(List<Partita> partite) {
		this.partite = partite;
	}

	@Override
	public String toString(){
		return "id="+id+", name="+nomepalinsesto;
	}

}
