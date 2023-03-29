package com.Abb.entities;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
@Table(name="TARIFELER")
public class Tarife {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="TarifeId", unique = true,nullable = false)
    private Long tarifeId;

    @Column(name="TarifeAdi")
    private String tarifeAdi;

    @Column(name = "TarifeUcreti")
    private Double tarifeUcreti;

    @OneToMany(mappedBy = "tarife")
    private List<Arac> arac;

    @OneToMany(mappedBy = "tarife")
    private List<Hareket> hareket;

    public Tarife() {
    }

    public Tarife(Long tarifeId, String tarifeAdi, Double tarifeUcreti, List<Arac> arac, List<Hareket> hareket) {
        this.tarifeId = tarifeId;
        this.tarifeAdi = tarifeAdi;
        this.tarifeUcreti = tarifeUcreti;
        this.arac = arac;
        this.hareket = hareket;
    }

    public Long getTarifeId() {
        return tarifeId;
    }

    public void setTarifeId(Long tarifeId) {
        this.tarifeId = tarifeId;
    }

    public String getTarifeAdi() {
        return tarifeAdi;
    }

    public void setTarifeAdi(String tarifeAdi) {
        this.tarifeAdi = tarifeAdi;
    }

    public Double getTarifeUcreti() {
        return tarifeUcreti;
    }

    public void setTarifeUcreti(Double tarifeUcreti) {
        this.tarifeUcreti = tarifeUcreti;
    }

    public List<Arac> getArac() {
        return arac;
    }

    public void setArac(List<Arac> arac) {
        this.arac = arac;
    }

    public List<Hareket> getHareket() {
        return hareket;
    }

    public void setHareket(List<Hareket> hareket) {
        this.hareket = hareket;
    }
}
