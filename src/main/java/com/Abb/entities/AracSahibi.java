package com.Abb.entities;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "ARAC_SAHIPLERI")
public class AracSahibi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AracSahibiId", nullable = false, unique = true)
    private Long aracSahibiId;
    @Column(name = "adi")
    private String adi;

    @Column(name = "Soyadi")
    private String soyadi;
    @Column(name = "KimlikNumarasi")
    private String kimlikNumarasi;

    @Column(name = "TelefonNumarasi")
    private String telefonNumarasi;

    @Column(name = "Sahip")
    private Boolean isSahip;

    @OneToMany(mappedBy = "aracSahibi")
    private List<Arac> arac;

    public AracSahibi() {
    }

    public AracSahibi(Long aracSahibiId, String adi, String soyadi, String kimlikNumarasi, String telefonNumarasi, Boolean isSahip, List<Arac> arac) {
        this.aracSahibiId = aracSahibiId;
        this.adi = adi;
        this.soyadi = soyadi;
        this.kimlikNumarasi = kimlikNumarasi;
        this.telefonNumarasi = telefonNumarasi;
        this.isSahip = isSahip;
        this.arac = arac;
    }

    public Long getAracSahibiId() {
        return this.aracSahibiId;
    }

    public void setAracSahibiId(Long aracSahibiId) {
        this.aracSahibiId = aracSahibiId;
    }

    public String getAdi() {
        return this.adi;
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

    public Boolean isSahip() {
        return isSahip;
    }

    public void setSahip(Boolean sahip) {
        isSahip = sahip;
    }

    public List<Arac> getArac() {
        return arac;
    }

    public void setArac(List<Arac> arac) {
        this.arac = arac;
    }
}
