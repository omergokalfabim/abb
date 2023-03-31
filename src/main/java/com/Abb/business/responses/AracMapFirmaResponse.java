package com.Abb.business.responses;

import java.sql.Timestamp;

public class AracMapFirmaResponse {
    private Long aracMapFirmaId;
    private String aracPlaka;
    private String firmaFirmairmaAdi;
    private Short kullaniciKod;
    private Timestamp kayitTarihi;
    private Boolean aktif;

    public AracMapFirmaResponse() {
    }

    public AracMapFirmaResponse(Long aracMapFirmaId, String aracPlaka, String firmaFirmairmaAdi, Short kullaniciKod, Timestamp kayitTarihi, Boolean aktif) {
        this.aracMapFirmaId = aracMapFirmaId;
        this.aracPlaka = aracPlaka;
        this.firmaFirmairmaAdi = firmaFirmairmaAdi;
        this.kullaniciKod = kullaniciKod;
        this.kayitTarihi = kayitTarihi;
        this.aktif = aktif;
    }

    public Long getAracMapFirmaId() {
        return aracMapFirmaId;
    }

    public void setAracMapFirmaId(Long aracMapFirmaId) {
        this.aracMapFirmaId = aracMapFirmaId;
    }

    public String getAracPlaka() {
        return aracPlaka;
    }

    public void setAracPlaka(String aracPlaka) {
        this.aracPlaka = aracPlaka;
    }

    public String getFirmaFirmaAdi() {
        return firmaFirmairmaAdi;
    }

    public void setFirmaFirmaAdi(String firmaAdi) {
        this.firmaFirmairmaAdi = firmaAdi;
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

    public Boolean getAktif() {
        return aktif;
    }

    public void setAktif(Boolean aktif) {
        this.aktif = aktif;
    }
}
