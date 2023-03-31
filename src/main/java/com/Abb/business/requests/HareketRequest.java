package com.Abb.business.requests;

import java.sql.Timestamp;

public class HareketRequest {
    private String saat;
    private String tarih;
    private String aciklama;
    private Long aracId;
    private Long firmaId;
    private Long tarifeId;
    private Short kullaniciKod;
    private Timestamp kayitTarihi;
    public HareketRequest() {
    }

    public HareketRequest(String saat, String tarih, String aciklama, Long aracId, Long firmaId, Long tarifeId, Short kullaniciKod, Timestamp kayitTarihi) {
        this.saat = saat;
        this.tarih = tarih;
        this.aciklama = aciklama;
        this.aracId = aracId;
        this.firmaId = firmaId;
        this.tarifeId = tarifeId;
        this.kullaniciKod = kullaniciKod;
        this.kayitTarihi = kayitTarihi;
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

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public Long getAracId() {
        return aracId;
    }

    public void setAracId(Long aracId) {
        this.aracId = aracId;
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
