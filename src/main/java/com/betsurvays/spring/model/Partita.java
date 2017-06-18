package com.betsurvays.spring.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;

@Entity
@Table(name="partita")
public class Partita {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="nome")
	private String nome;

	@ManyToOne
    @Column(name="idpalinsesto")
    private int idpalinsesto;
	
	
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

	public int getIdpalinsesto() {
		return idpalinsesto;
	}

	public void setIdpalinsesto(int idpalinsesto) {
		this.idpalinsesto = idpalinsesto;
	}

}
