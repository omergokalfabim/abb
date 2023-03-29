package com.Abb.business.requests;

import java.util.Date;

public class SoforMapAracRequest {
    private Long soforMapAracId;
    private Long soforId;
    private Long aracId;
    private Boolean isAktif;
    private Short kullaniciKod;
    private Date  kayitTarihi;

    public SoforMapAracRequest() {
    }

    public SoforMapAracRequest(Long soforMapAracId, Long soforId, Long aracId, Boolean isAktif, Short kullaniciKod, Date kayitTarihi) {
        this.soforMapAracId = soforMapAracId;
        this.soforId = soforId;
        this.aracId = aracId;
        this.isAktif = isAktif;
        this.kullaniciKod = kullaniciKod;
        this.kayitTarihi = kayitTarihi;
    }

    public Long getSoforMapAracId() {
        return soforMapAracId;
    }

    public void setSoforMapAracId(Long soforMapAracId) {
        this.soforMapAracId = soforMapAracId;
    }

    public Long getSoforId() {
        return soforId;
    }

    public void setSoforId(Long soforId) {
        this.soforId = soforId;
    }

    public Long getAracId() {
        return aracId;
    }

    public void setAracId(Long aracId) {
        this.aracId = aracId;
    }

    public Boolean getAktif() {
        return isAktif;
    }

    public void setAktif(Boolean aktif) {
        isAktif = aktif;
    }

    public Short getKullaniciKod() {
        return kullaniciKod;
    }

    public void setKullaniciKod(Short kullaniciKod) {
        this.kullaniciKod = kullaniciKod;
    }

    public Date getKayitTarihi() {
        return kayitTarihi;
    }

    public void setKayitTarihi(Date kayitTarihi) {
        this.kayitTarihi = kayitTarihi;
    }
}
