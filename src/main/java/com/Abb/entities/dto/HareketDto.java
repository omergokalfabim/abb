package com.Abb.entities.dto;

public class HareketDto {
    private String plaka;
    private String firmaAdi;
    private String tarifeAdi;
    private double tarifeUcreti;
    private String aciklama;

    public HareketDto() {
    }

    public HareketDto( String plaka, String firmaAdi, String tarifeAdi, double tarifeUcreti, String aciklama) {
        this.plaka = plaka;
        this.firmaAdi = firmaAdi;
        this.tarifeAdi = tarifeAdi;
        this.tarifeUcreti = tarifeUcreti;
        this.aciklama = aciklama;
    }


    public String getPlaka() {
        return plaka;
    }

    public void setPlaka(String plaka) {
        this.plaka = plaka;
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

    public double getTarifeUcreti() {
        return tarifeUcreti;
    }

    public void setTarifeUcreti(double tarifeUcreti) {
        this.tarifeUcreti = tarifeUcreti;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

}
