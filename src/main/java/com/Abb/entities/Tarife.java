package com.Abb.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="Tarife")
public class Tarife {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="tarifeId", unique = true,nullable = false)
    private Long tarifeId;

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

    public Tarife(long tarifeId, String tarifeAdi, double tarifeUcret,  List<Arac> arac, List<Hareket> hareket) {
        this.tarifeId = tarifeId;
        this.tarifeAdi = tarifeAdi;
        this.tarifeUcret = tarifeUcret;
        this.arac = arac;
        this.hareket = hareket;
    }

    public long getTarifeId() {
        return tarifeId;
    }

    public void setTarifeId(long tarifeId) {
        this.tarifeId = tarifeId;
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
