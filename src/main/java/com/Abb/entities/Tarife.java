package com.Abb.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="Tarife")
public class Tarife {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", unique = true,nullable = false)
    private Long id;

    @Column(name="tarifeAdi")
    private String tarifeAdi;

    @Column(name = "tarifeUcret")
    private Double tarifeUcret;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Arac> arac;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Hareket> hareket;

    public Tarife() {
    }

    public Tarife(long id, String tarifeAdi, double tarifeUcret,  List<Arac> arac, List<Hareket> hareket) {
        this.id = id;
        this.tarifeAdi = tarifeAdi;
        this.tarifeUcret = tarifeUcret;
        this.arac = arac;
        this.hareket = hareket;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTarifeAdi() {
        return tarifeAdi;
    }

    public void setTarifeAdi(String tarifeAdi) {
        this.tarifeAdi = tarifeAdi;
    }

    public double getTarifeUcret() {
        return tarifeUcret;
    }

    public void setTarifeUcret(double tarifeUcret) {
        this.tarifeUcret = tarifeUcret;
    }

    public  List<Arac> getArac() {
        return arac;
    }

    public void setArac( List<Arac> arac) {
        this.arac = arac;
    }

    public List<Hareket> getOtogar() {
        return hareket;
    }

    public void setOtogar(List<Hareket> hareket) {
        this.hareket = hareket;
    }
}
