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
	private Long id;

	@Column(name="nome")
	private String nome;

    @Column(name="idpalinsesto")
    private Long idpalinsesto;
	
	
	public Partita(){}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getIdpalinsesto() {
		return idpalinsesto;
	}

	public void setIdpalinsesto(Long idpalinsesto) {
		this.idpalinsesto = idpalinsesto;
	}

}
