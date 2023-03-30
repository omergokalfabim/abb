package com.Abb.business.responses;

import java.sql.Timestamp;

public class AracMapFirmaResponse {
    private Long aracMapFirmaId;
    private Long plaka;
    private Long firmaAdi;
    private Short kullaniciKod;
    private Timestamp kayitTarihi;
    private Boolean aktif;

    public AracMapFirmaResponse() {
    }

    public AracMapFirmaResponse(Long aracMapFirmaId, Long plaka, Long firmaAdi, Short kullaniciKod, Timestamp kayitTarihi, Boolean aktif) {
        this.aracMapFirmaId = aracMapFirmaId;
        this.plaka = plaka;
        this.firmaAdi = firmaAdi;
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

    public Long getPlaka() {
        return plaka;
    }

    public void setPlaka(Long plaka) {
        this.plaka = plaka;
    }

    public Long getFirmaAdi() {
        return firmaAdi;
    }

    public void setFirmaAdi(Long firmaAdi) {
        this.firmaAdi = firmaAdi;
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
