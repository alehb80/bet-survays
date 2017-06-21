package com.betsurvays.spring.model;

import java.util.Date;

import org.hibernate.annotations.Proxy;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;

@Entity
@Table(name="partita")
@Proxy(lazy = false)
public class Partita {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="nome")
	private String nome;

    @ManyToOne(cascade = {CascadeType.PERSIST})
	private Palinsesto palinsesto;
	
	public Partita(){}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Palinsesto getPalinsesto() {
		return palinsesto;
	}

	public void setPalinsesto(Palinsesto palinsesto) {
		this.palinsesto = palinsesto;
	}

}
