package com.Abb.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "AracSahibi")
public class AracSahibi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "aracSahibiId", nullable = false, unique = true)
    private Long aracSahibiId;
    @Column(name = "adi")
    private String aracSahibiAdi;

    @Column(name = "soyadi")
    private String aracSahibiSoyadi;
    @Column(name = "kimlikNumarasi")
    private String aracSahibiKimlikNumarasi;

    @Column(name = "telefonNumarasi")
    private String aracSahibiTelefonNumarasi;

    @Column(name = "isSahip")
    private boolean isSahip;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Arac> arac;

    public AracSahibi() {
    }

    public AracSahibi(Long aracSahibiId, String aracSahibiAdi, String aracSahibiSoyadi, String aracSahibiKimlikNumarasi, String aracSahibiTelefonNumarasi, boolean isSahip, List<Arac> arac) {
        this.aracSahibiId = aracSahibiId;
        this.aracSahibiAdi = aracSahibiAdi;
        this.aracSahibiSoyadi = aracSahibiSoyadi;
        this.aracSahibiKimlikNumarasi = aracSahibiKimlikNumarasi;
        this.aracSahibiTelefonNumarasi = aracSahibiTelefonNumarasi;
        this.isSahip = isSahip;
        this.arac = arac;
    }

    public Long getAracSahibiId() {
        return aracSahibiId;
    }

    public void setAracSahibiId(Long aracSahibiId) {
        this.aracSahibiId = aracSahibiId;
    }

    public String getAracSahibiAdi() {
        return aracSahibiAdi;
    }

    public void setAracSahibiAdi(String aracSahibiAdi) {
        this.aracSahibiAdi = aracSahibiAdi;
    }

    public String getAracSahibiSoyadi() {
        return aracSahibiSoyadi;
    }

    public void setAracSahibiSoyadi(String aracSahibiSoyadi) {
        this.aracSahibiSoyadi = aracSahibiSoyadi;
    }

    public String getAracSahibiKimlikNumarasi() {
        return aracSahibiKimlikNumarasi;
    }

    public void setAracSahibiKimlikNumarasi(String aracSahibiKimlikNumarasi) {
        this.aracSahibiKimlikNumarasi = aracSahibiKimlikNumarasi;
    }

    public String getAracSahibiTelefonNumarasi() {
        return aracSahibiTelefonNumarasi;
    }

    public void setAracSahibiTelefonNumarasi(String aracSahibiTelefonNumarasi) {
        this.aracSahibiTelefonNumarasi = aracSahibiTelefonNumarasi;
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
