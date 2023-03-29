package com.Abb.business.responses;

import com.Abb.entities.Arac;

import java.util.Date;

public class SoforMapAracResponse {
    private Long soforMapAracId;
    private String aracPlaka;
    private String soforAdi;
    private Date kayitTarihi;
    private Short kullaniciKod;

    public SoforMapAracResponse() {
    }

    public SoforMapAracResponse(Long soforMapAracId, String aracPlaka, String soforAdi, Date kayitTarihi, Short kullaniciKod) {
        this.soforMapAracId = soforMapAracId;
        this.aracPlaka = aracPlaka;
        this.soforAdi = soforAdi;
        this.kayitTarihi = kayitTarihi;
        this.kullaniciKod = kullaniciKod;
    }

    public Long getSoforMapAracId() {
        return soforMapAracId;
    }

    public void setSoforMapAracId(Long soforMapAracId) {
        this.soforMapAracId = soforMapAracId;
    }

    public String getAracPlaka() {
        return aracPlaka;
    }

    public void setAracPlaka(String aracPlaka) {
        this.aracPlaka = aracPlaka;
    }

    public String getSoforAdi() {
        return soforAdi;
    }

    public void setSoforAdi(String soforAdi) {
        this.soforAdi = soforAdi;
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
