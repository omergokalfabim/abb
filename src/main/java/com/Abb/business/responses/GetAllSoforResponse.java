package com.Abb.business.responses;

import com.Abb.entities.SoforMapArac;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

import java.util.Date;
import java.util.List;

public class GetAllSoforResponse {
    public static final String[] propertyOrder = { "soforId", "adi", "soyadi", "telefon", "kayitTarihi", "kullaniciKod", "soforMapArac"};

    private Long soforId;

    private String adi;

    private String soyadi;

    private String telefon;

    private Date kayitTarihi;

    private Short kullaniciKod;

    private List<SoforMapArac> soforMapArac;

    public GetAllSoforResponse() {
    }

    public GetAllSoforResponse(Long soforId, String adi, String soyadi, String telefon, Date kayitTarihi, Short kullaniciKod, List<SoforMapArac> soforMapArac) {
        this.soforId = soforId;
        this.adi = adi;
        this.soyadi = soyadi;
        this.telefon = telefon;
        this.kayitTarihi = kayitTarihi;
        this.kullaniciKod = kullaniciKod;
        this.soforMapArac = soforMapArac;
    }

    public Long getSoforId() {
        return soforId;
    }

    public void setSoforId(Long soforId) {
        this.soforId = soforId;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public Date getKayitTarihi() {
        return kayitTarihi;
    }

    public void setKayitTarihi(Date kayitTarihi) {
        this.kayitTarihi = kayitTarihi;
    }

    public Short getKullaniciKod() {
        return kullaniciKod;
    }

    public void setKullaniciKod(Short kullaniciKod) {
        this.kullaniciKod = kullaniciKod;
    }

    public List<SoforMapArac> getSoforMapArac() {
        return soforMapArac;
    }

    public void setSoforMapArac(List<SoforMapArac> soforMapArac) {
        this.soforMapArac = soforMapArac;
    }
}
