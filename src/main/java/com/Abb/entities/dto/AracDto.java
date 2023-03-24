package com.Abb.entities.dto;

public class AracDto {
    private int peronNo;
    private String firmaAdi;

    private String plaka;
    private String aracSahibiAdi;
    private String aracSahibiSoyadi;
    private String aracSahibiKimlikNumarasi;
    private String aracSahibiTelefonNumarasi;

    private boolean isSahip;

    private String soforAdi;
    private String soforSoyadi;
    private String soforTelefonNo;

    private String tarifeAdi;
    private double tarifeUcreti;
    private String aciklama;

    public AracDto() {
    }

    public AracDto(int peronNo, String firmaAdi, String plaka, String aracSahibiAdi, String aracSahibiSoyadi, String aracSahibiKimlikNumarasi, String aracSahibiTelefonNumarasi, boolean isSahip, String soforAdi, String soforSoyadi, String soforTelefonNo, String tarifeAdi, double tarifeUcreti, String aciklama) {
        this.peronNo = peronNo;
        this.firmaAdi = firmaAdi;
        this.plaka = plaka;
        this.aracSahibiAdi = aracSahibiAdi;
        this.aracSahibiSoyadi = aracSahibiSoyadi;
        this.aracSahibiKimlikNumarasi = aracSahibiKimlikNumarasi;
        this.aracSahibiTelefonNumarasi = aracSahibiTelefonNumarasi;
        this.isSahip = isSahip;
        this.soforAdi = soforAdi;
        this.soforSoyadi = soforSoyadi;
        this.soforTelefonNo = soforTelefonNo;
        this.tarifeAdi = tarifeAdi;
        this.tarifeUcreti = tarifeUcreti;
        this.aciklama = aciklama;
    }

    public int getPeronNo() {
        return peronNo;
    }

    public void setPeronNo(int peronNo) {
        this.peronNo = peronNo;
    }

    public String getFirmaAdi() {
        return firmaAdi;
    }

    public void setFirmaAdi(String firmaAdi) {
        this.firmaAdi = firmaAdi;
    }

    public String getPlaka() {
        return plaka;
    }

    public void setPlaka(String plaka) {
        this.plaka = plaka;
    }

    public String getAracSahibiAdi() {
        return aracSahibiAdi;
    }

    public void setAracSahibiAdi(String aracSahibiAdi) {
        this.aracSahibiAdi = aracSahibiAdi;
    }

    public String getAracSahibiSoyadi() {
        return aracSahibiSoyadi;
    }

    public void setAracSahibiSoyadi(String aracSahibiSoyadi) {
        this.aracSahibiSoyadi = aracSahibiSoyadi;
    }

    public String getAracSahibiKimlikNumarasi() {
        return aracSahibiKimlikNumarasi;
    }

    public void setAracSahibiKimlikNumarasi(String aracSahibiKimlikNumarasi) {
        this.aracSahibiKimlikNumarasi = aracSahibiKimlikNumarasi;
    }

    public String getAracSahibiTelefonNumarasi() {
        return aracSahibiTelefonNumarasi;
    }

    public void setAracSahibiTelefonNumarasi(String aracSahibiTelefonNumarasi) {
        this.aracSahibiTelefonNumarasi = aracSahibiTelefonNumarasi;
    }

    public boolean isSahip() {
        return isSahip;
    }

    public void setSahip(boolean sahip) {
        isSahip = sahip;
    }

    public String getSoforAdi() {
        return soforAdi;
    }

    public void setSoforAdi(String soforAdi) {
        this.soforAdi = soforAdi;
    }

    public String getSoforSoyadi() {
        return soforSoyadi;
    }

    public void setSoforSoyadi(String soforSoyadi) {
        this.soforSoyadi = soforSoyadi;
    }

    public String getSoforTelefonNo() {
        return soforTelefonNo;
    }

    public void setSoforTelefonNo(String soforTelefonNo) {
        this.soforTelefonNo = soforTelefonNo;
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
