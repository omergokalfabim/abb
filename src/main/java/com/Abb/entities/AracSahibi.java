package com.Abb.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "AracSahibi")
public class AracSahibi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;
    @Column(name = "adi")
    private String adi;

    @Column(name = "soyadi")
    private String soyadi;
    @Column(name = "kimlikNumarasi")
    private String kimlikNumarasi;

    @Column(name = "telefonNumarasi")
    private String telefonNumarasi;

    @Column(name = "isSahip")
    private boolean isSahip;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Arac> arac;

    public AracSahibi() {
    }

    public AracSahibi(Long id, String adi, String soyadi, String kimlikNumarasi, String telefonNumarasi, boolean isSahip, List<Arac> arac) {
        this.id = id;
        this.adi = adi;
        this.soyadi = soyadi;
        this.kimlikNumarasi = kimlikNumarasi;
        this.telefonNumarasi = telefonNumarasi;
        this.isSahip = isSahip;
        this.arac = arac;
    }

    public Long getid() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public String getKimlikNumarasi() {
        return kimlikNumarasi;
    }

    public void setKimlikNumarasi(String kimlikNumarasi) {
        this.kimlikNumarasi = kimlikNumarasi;
    }

    public String getTelefonNumarasi() {
        return telefonNumarasi;
    }

    public void setTelefonNumarasi(String telefonNumarasi) {
        this.telefonNumarasi = telefonNumarasi;
    }

    public boolean isSahip() {
        return isSahip;
    }

    public void setSahip(boolean sahip) {
        isSahip = sahip;
    }

    public List<Arac> getArac() {
        return arac;
    }

    public void setArac(List<Arac> arac) {
        this.arac = arac;
    }
}
