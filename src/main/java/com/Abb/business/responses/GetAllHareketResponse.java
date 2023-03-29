package com.Abb.business.responses;

public class GetAllHareketResponse {
    private String saat;
    private String tarih;
    private String aracPlaka;
    private String firmaAdi;
    private String tarifeAdi;
    private Double tarifeUcreti;
    private String aciklama;

    public GetAllHareketResponse() {
    }

    public GetAllHareketResponse(String saat, String tarih, String aracPlaka, String firmaAdi, String tarifeAdi, Double tarifeUcreti, String aciklama) {
        this.saat = saat;
        this.tarih = tarih;
        this.aracPlaka = aracPlaka;
        this.firmaAdi = firmaAdi;
        this.tarifeAdi = tarifeAdi;
        this.tarifeUcreti = tarifeUcreti;
        this.aciklama = aciklama;
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

    public String getFirmaAdi() {
        return firmaAdi;
    }

    public void setFirmaAdi(String firmaAdi) {
        this.firmaAdi = firmaAdi;
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
