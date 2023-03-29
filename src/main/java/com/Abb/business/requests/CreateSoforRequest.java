package com.Abb.business.requests;

import java.util.Date;

public class CreateSoforRequest {

    private String adi;
    private String soyadi;
    private String telefonNumarasi;

    private Date  kayitTarihi;
    private Short kullaniciKod;
    public CreateSoforRequest() {
    }

    public CreateSoforRequest(String adi, String soyadi, String telefonNumarasi, Date kayitTarihi, Short kullaniciKod) {
        this.adi = adi;
        this.soyadi = soyadi;
        this.telefonNumarasi = telefonNumarasi;
        this.kayitTarihi = kayitTarihi;
        this.kullaniciKod = kullaniciKod;
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

    public String getTelefonNumarasi() {
        return telefonNumarasi;
    }

    public void setTelefonNumarasi(String telefonNumarasi) {
        this.telefonNumarasi = telefonNumarasi;
    }

    public Date getKayitTarihi() {
        return kayitTarihi;
    }

    public void setKayitTarihi(Date kayitTarihi) {
        this.kayitTarihi = kayitTarihi;
    }

    public Short getKullaniciKod() {
        return kullaniciKod;
    }

    public void setKullaniciKod(Short kullaniciKod) {
        this.kullaniciKod = kullaniciKod;
    }
}
