package com.Abb.entities;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.List;

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

    @Column(name = "KullaniciKod")
    private Short kullaniciKod;

    @Column(name="KayitTarihi")
    private Timestamp kayitTarihi;

    public Tarife() {
    }

    public Tarife(Long tarifeId, String tarifeAdi, Double tarifeUcreti, List<Arac> arac, List<Hareket> hareket, Short kullaniciKod, Timestamp kayitTarihi) {
        this.tarifeId = tarifeId;
        this.tarifeAdi = tarifeAdi;
        this.tarifeUcreti = tarifeUcreti;
        this.arac = arac;
        this.hareket = hareket;
        this.kullaniciKod = kullaniciKod;
        this.kayitTarihi = kayitTarihi;
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

    public Short getKullaniciKod() {
        return kullaniciKod;
    }

    public void setKullaniciKod(Short kullaniciKod) {
        this.kullaniciKod = kullaniciKod;
    }

    public Timestamp getKayitTarihi() {
        return kayitTarihi;
    }

    public void setKayitTarihi(Timestamp kayitTarihi) {
        this.kayitTarihi = kayitTarihi;
    }
}
