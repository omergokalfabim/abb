package com.Abb.entities;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.List;

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

    @Column(name="kullaniciKod")
    private Short kullaniciKod;

    @Column(name="kayitTarihi")
    private Timestamp kayitTarihi;
    @OneToMany(mappedBy = "aracSahibi")
    private List<Arac> arac;

    public AracSahibi() {
    }

    public AracSahibi(Long aracSahibiId, String adi, String soyadi, String kimlikNumarasi, String telefonNumarasi, Boolean isSahip, Short kullaniciKod, Timestamp kayitTarihi, List<Arac> arac) {
        this.aracSahibiId = aracSahibiId;
        this.adi = adi;
        this.soyadi = soyadi;
        this.kimlikNumarasi = kimlikNumarasi;
        this.telefonNumarasi = telefonNumarasi;
        this.isSahip = isSahip;
        this.kullaniciKod = kullaniciKod;
        this.kayitTarihi = kayitTarihi;
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

    public Boolean getSahip() {
        return isSahip;
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

    public void setArac(List<Arac> arac) {
        this.arac = arac;
    }
}
