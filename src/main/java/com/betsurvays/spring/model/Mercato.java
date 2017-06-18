package com.betsurvays.spring.model;

import javax.persistence.*;

/**
 * Created by alessio on 18/06/17.
 */
@Entity
@Table(name="mercato")
public class Mercato {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column(name="segno")
    private String segno;

    @Column(name="quota")
    private String quota;

    @ManyToOne(cascade = { CascadeType.PERSIST,CascadeType.REMOVE })
    private Partita partita;

    public Mercato() {
    }

    public Mercato(String segno, String quota) {
        this.segno = segno;
        this.quota = quota;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSegno() {
        return segno;
    }

    public void setSegno(String segno) {
        this.segno = segno;
    }

    public String getQuota() {
        return quota;
    }

    public void setQuota(String quota) {
        this.quota = quota;
    }

    public Partita getPartita() {
        return partita;
    }

    public void setPartita(Partita partita) {
        this.partita = partita;
    }

}
