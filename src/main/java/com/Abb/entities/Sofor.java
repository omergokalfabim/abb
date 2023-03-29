package com.Abb.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "SOFORLER")
public class Sofor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SoforId",unique = true,nullable = false)
    private Long soforId;

    @Column(name="Adi")
    private String adi;

    @Column(name="Soyadi")
    private String soyadi;

    @Column(name="Telefon")
    private String telefon;

    @Column(name="KayitTarihi")
    private Date kayitTarihi;

    @Column(name="KullaniciKod")
    private Short kullaniciKod;

    @OneToMany
    @JoinColumn(name="soforId", referencedColumnName = "soforId")
    private List<SoforMapArac> soforMapArac;

    public Sofor() {
    }

    public Sofor(Long soforId, String adi, String soyadi, String telefon, Date kayitTarihi, Short kullaniciKod, List<SoforMapArac> soforMapArac) {
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

    public List<SoforMapArac> getSoforlerMapAraclar() {
        return soforMapArac;
    }

    public void setSoforlerMapAraclar(List<SoforMapArac> soforMapArac) {
        this.soforMapArac = soforMapArac;
    }
}
