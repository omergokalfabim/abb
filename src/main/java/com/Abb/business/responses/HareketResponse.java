package com.Abb.business.responses;

public class HareketResponse {
    private Long hareketId;
    private String saat;
    private String tarih;
    private String aracPlaka;
    private String firmaFirmaAdi;
    private String tarifeAdi;
    private Double tarifeUcreti;
    private String aciklama;

    public HareketResponse() {
    }

    public HareketResponse(Long hareketId, String saat, String tarih, String aracPlaka, String firmaFirmaAdi, String tarifeAdi, Double tarifeUcreti, String aciklama) {
        this.hareketId = hareketId;
        this.saat = saat;
        this.tarih = tarih;
        this.aracPlaka = aracPlaka;
        this.firmaFirmaAdi = firmaFirmaAdi;
        this.tarifeAdi = tarifeAdi;
        this.tarifeUcreti = tarifeUcreti;
        this.aciklama = aciklama;
    }

    public Long getHareketId() {
        return hareketId;
    }

    public void setHareketId(Long hareketId) {
        this.hareketId = hareketId;
    }

    public String getSaat() {
        return saat;
    }

    public void setSaat(String saat) {
        this.saat = saat;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
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

    public String getTarifeAdi() {
        return tarifeAdi;
    }

    public void setTarifeAdi(String tarifeAdi) {
        this.tarifeAdi = tarifeAdi;
    }

    public Double getTarifeUcreti() {
        return tarifeUcreti;
    }

    public void setTarifeUcreti(Double tarifeUcreti) {
        this.tarifeUcreti = tarifeUcreti;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }
}
