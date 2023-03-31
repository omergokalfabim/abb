package com.Abb.business.requests;

import java.sql.Timestamp;

public class AracSahibiRequest {
    private String adi;
    private String soyadi;
    private String kimlikNo;
    private String telefonNo;
    private Boolean isSahip;

    private Short kullaniciKod;
    private Timestamp kayitTarihi;

    public AracSahibiRequest() {
    }

    public AracSahibiRequest(String adi, String soyadi, String kimlikNo, String telefonNo, Boolean isSahip, Short kullaniciKod, Timestamp kayitTarihi) {
        this.adi = adi;
        this.soyadi = soyadi;
        this.kimlikNo = kimlikNo;
        this.telefonNo = telefonNo;
        this.isSahip = isSahip;
        this.kullaniciKod = kullaniciKod;
        this.kayitTarihi = kayitTarihi;
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

    public String getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(String kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public String getTelefonNo() {
        return telefonNo;
    }

    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }

    public void setSahip(Boolean sahip) {
        isSahip = sahip;
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
}
