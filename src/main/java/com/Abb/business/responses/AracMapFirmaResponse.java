package com.Abb.business.responses;

import java.sql.Timestamp;

public class AracMapFirmaResponse {
    private Long aracMapFirmaId;
    private Integer firmaPeronNo;
    private String aracPlaka;
    private String firmaFirmaAdi;
    private Short kullaniciKod;
    private Timestamp kayitTarihi;
    private Boolean aktif;

    public AracMapFirmaResponse() {
    }

    public AracMapFirmaResponse(Long aracMapFirmaId, Integer firmaPeronNo, String aracPlaka, String firmaFirmaAdi, Short kullaniciKod, Timestamp kayitTarihi, Boolean aktif) {
        this.aracMapFirmaId = aracMapFirmaId;
        this.firmaPeronNo = firmaPeronNo;
        this.aracPlaka = aracPlaka;
        this.firmaFirmaAdi = firmaFirmaAdi;
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

    public Integer getFirmaPeronNo() {
        return firmaPeronNo;
    }

    public void setFirmaPeronNo(Integer firmaPeronNo) {
        this.firmaPeronNo = firmaPeronNo;
    }

    public String getAracPlaka() {
        return aracPlaka;
    }

    public void setAracPlaka(String aracPlaka) {
        this.aracPlaka = aracPlaka;
    }

    public String getFirmaFirmaAdi() {
        return firmaFirmaAdi;
    }

    public void setFirmaFirmaAdi(String firmaFirmaAdi) {
        this.firmaFirmaAdi = firmaFirmaAdi;
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
