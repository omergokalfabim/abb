package com.Abb.entities;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name="AraclarMapFirmalar")
public class AracMapFirma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="AracMapFirmaId")
    private Long aracMapFirmaId;

    @ManyToOne(targetEntity = Arac.class)
    @JoinColumn(name="AracId",foreignKey = @ForeignKey(name="FK_AraclarMapFirmalar_Arac"))
    private Arac arac;

    @ManyToOne(targetEntity = Firma.class)
    @JoinColumn(name="FirmaId",foreignKey = @ForeignKey(name="FK_AraclarMapFirmalar_Firma"))
    private Firma firma;

    @Column(name="KullaniciKod")
    private Short kullaniciKod;

    @Column(name = "KayitTarihi")
    private Timestamp kayitTarihi;

    @Column(name="Aktif")
    private Boolean aktif;

    public AracMapFirma() {
    }

    public AracMapFirma(Long aracMapFirmaId, Arac arac, Firma firma, Short kullaniciKod, Timestamp kayitTarihi, Boolean aktif) {
        this.aracMapFirmaId = aracMapFirmaId;
        this.arac = arac;
        this.firma = firma;
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

    public Arac getArac() {
        return arac;
    }

    public void setArac(Arac arac) {
        this.arac = arac;
    }

    public Firma getFirma() {
        return firma;
    }

    public void setFirma(Firma firma) {
        this.firma = firma;
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
