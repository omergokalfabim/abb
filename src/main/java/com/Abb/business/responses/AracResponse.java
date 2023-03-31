package com.Abb.business.responses;

import java.sql.Timestamp;

public class AracResponse {
    private Long aracId;
    private Integer peronNo;
    private String plaka;
    private String firmaAdi;
    private String aracSahibiAdi;
    private String aracSahibiSoyadi;
    private String aracSahibiTelefon;
    private String aciklama;
    private String tarifeAdi;
    private String tarifeUcreti;
    private Short kullaniciKod;
    private Timestamp kayitTarihi;
    public AracResponse() {
    }

    public AracResponse(Long aracId, Integer peronNo, String plaka, String firmaAdi, String aracSahibiAdi, String aracSahibiSoyadi, String aracSahibiTelefon, String aciklama, String tarifeAdi, String tarifeUcreti, Short kullaniciKod, Timestamp kayitTarihi) {
        this.aracId = aracId;
        this.peronNo = peronNo;
        this.plaka = plaka;
        this.firmaAdi = firmaAdi;
        this.aracSahibiAdi = aracSahibiAdi;
        this.aracSahibiSoyadi = aracSahibiSoyadi;
        this.aracSahibiTelefon = aracSahibiTelefon;
        this.aciklama = aciklama;
        this.tarifeAdi = tarifeAdi;
        this.tarifeUcreti = tarifeUcreti;
        this.kullaniciKod = kullaniciKod;
        this.kayitTarihi = kayitTarihi;
    }

    public Long getAracId() {
        return aracId;
    }

    public void setAracId(Long aracId) {
        this.aracId = aracId;
    }

    public Integer getPeronNo() {
        return peronNo;
    }

    public void setPeronNo(Integer peronNo) {
        this.peronNo = peronNo;
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

    public String getAracSahibiTelefon() {
        return aracSahibiTelefon;
    }

    public void setAracSahibiTelefon(String aracSahibiTelefon) {
        this.aracSahibiTelefon = aracSahibiTelefon;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public String getTarifeAdi() {
        return tarifeAdi;
    }

    public void setTarifeAdi(String tarifeAdi) {
        this.tarifeAdi = tarifeAdi;
    }

    public String getTarifeUcreti() {
        return tarifeUcreti;
    }

    public void setTarifeUcreti(String tarifeUcreti) {
        this.tarifeUcreti = tarifeUcreti;
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
