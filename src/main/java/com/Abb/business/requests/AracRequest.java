package com.Abb.business.requests;

import java.sql.Timestamp;

public class AracRequest {
    private Long aracId;
    private String aciklama;
    private String plaka;
    private Long aracSahibiId;
    private Long firmaId;
    private Long tarifeId;

    private Short kullaniciKod;
    private Timestamp kayitTarihi;

    public AracRequest() {
    }

    public AracRequest(Long aracId, String aciklama, String plaka, Long aracSahibiId, Long firmaId, Long tarifeId, Short kullaniciKod, Timestamp kayitTarihi) {
        this.aracId = aracId;
        this.aciklama = aciklama;
        this.plaka = plaka;
        this.aracSahibiId = aracSahibiId;
        this.firmaId = firmaId;
        this.tarifeId = tarifeId;
        this.kullaniciKod = kullaniciKod;
        this.kayitTarihi = kayitTarihi;
    }

    public Long getAracId() {
        return aracId;
    }

    public void setAracId(Long aracId) {
        this.aracId = aracId;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public String getPlaka() {
        return plaka;
    }

    public void setPlaka(String plaka) {
        this.plaka = plaka;
    }

    public Long getAracSahibiId() {
        return aracSahibiId;
    }

    public void setAracSahibiId(Long aracSahibiId) {
        this.aracSahibiId = aracSahibiId;
    }

    public Long getFirmaId() {
        return firmaId;
    }

    public void setFirmaId(Long firmaId) {
        this.firmaId = firmaId;
    }

    public Long getTarifeId() {
        return tarifeId;
    }

    public void setTarifeId(Long tarifeId) {
        this.tarifeId = tarifeId;
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
