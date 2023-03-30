package com.Abb.business.requests;

import java.sql.Timestamp;

public class AracMapFirmaRequest {
    private Long aracMapFirmaId;
    private Long aracId;
    private Long firmaId;
    private Short kullaniciKod;
    private Timestamp kayitTarihi;
    private Boolean aktif;

    public AracMapFirmaRequest() {
    }

    public AracMapFirmaRequest(Long aracMapFirmaId, Long aracId, Long firmaId, Short kullaniciKod, Timestamp kayitTarihi, Boolean aktif) {
        this.aracMapFirmaId = aracMapFirmaId;
        this.aracId = aracId;
        this.firmaId = firmaId;
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
