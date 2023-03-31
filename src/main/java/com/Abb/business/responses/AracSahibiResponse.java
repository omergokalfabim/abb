package com.Abb.business.responses;

import java.sql.Timestamp;

public class AracSahibiResponse {
    private Long aracSahibiId;
    private String adi;
    private String soyadi;

    private String kimlikNumarasi;
    private String telefonNumarasi;

    private String isSahip;

    private Short kullaniciKod;
    private Timestamp kayitTarihi;

    public AracSahibiResponse() {
    }

    public AracSahibiResponse(Long aracSahibiId, String adi, String soyadi, String kimlikNumarasi, String telefonNumarasi, String isSahip, Short kullaniciKod, Timestamp kayitTarihi) {
        this.aracSahibiId = aracSahibiId;
        this.adi = adi;
        this.soyadi = soyadi;
        this.kimlikNumarasi = kimlikNumarasi;
        this.telefonNumarasi = telefonNumarasi;
        this.isSahip = isSahip;
        this.kullaniciKod = kullaniciKod;
        this.kayitTarihi = kayitTarihi;
    }

    public Long getAracSahibiId() {
        return aracSahibiId;
    }

    public void setAracSahibiId(Long aracSahibiId) {
        this.aracSahibiId = aracSahibiId;
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

    public String getIsSahip() {
        return isSahip;
    }

    public void setIsSahip(String isSahip) {
        this.isSahip = isSahip;
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
