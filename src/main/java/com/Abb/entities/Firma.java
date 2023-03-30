package com.Abb.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "FIRMALAR")
public class Firma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FirmaId", unique = true, nullable = false)
    private Long FirmaId;

    @Column(name = "PeronNo")
    private Integer peronNo;

    @Column(name = "FirmaAdi")
    private String firmaAdi;


    @Column(name = "YetkiliAdi")
    private String yetkiliAdi;

    @Column(name = "YetkiliSoyadi")
    private String yetkiliSoyadi;

    @Column(name = "TelefonNo")
    private String telefonNo;

    @Column(name = "DahiliTelefonNo")
    private String dahiliTelefonNo;

    @Column(name = "GsmNo")
    private String gsmNo;

    @Column(name = "Aciklama")
    private String aciklama;

    @OneToMany(mappedBy = "firma")
    private List<Hareket> hareket;

    @Column(name = "Aktif")
    private Boolean aktif;
    @OneToMany(mappedBy = "firma")
    private List<AracMapFirma> aracMapFirmaList;
    public Firma() {
    }

    public Firma(Long firmaId, Integer peronNo, String firmaAdi, String yetkiliAdi, String yetkiliSoyadi, String telefonNo, String dahiliTelefonNo, String gsmNo, String aciklama, List<Hareket> hareket, Boolean aktif, List<AracMapFirma> aracMapFirmaList) {
        FirmaId = firmaId;
        this.peronNo = peronNo;
        this.firmaAdi = firmaAdi;
        this.yetkiliAdi = yetkiliAdi;
        this.yetkiliSoyadi = yetkiliSoyadi;
        this.telefonNo = telefonNo;
        this.dahiliTelefonNo = dahiliTelefonNo;
        this.gsmNo = gsmNo;
        this.aciklama = aciklama;
        this.hareket = hareket;
        this.aktif = aktif;
        this.aracMapFirmaList = aracMapFirmaList;
    }

    public Long getFirmaId() {
        return FirmaId;
    }

    public void setFirmaId(Long firmaId) {
        FirmaId = firmaId;
    }

    public Integer getPeronNo() {
        return peronNo;
    }

    public void setPeronNo(Integer peronNo) {
        this.peronNo = peronNo;
    }

    public String getFirmaAdi() {
        return firmaAdi;
    }

    public void setFirmaAdi(String firmaAdi) {
        this.firmaAdi = firmaAdi;
    }

    public String getYetkiliAdi() {
        return yetkiliAdi;
    }

    public void setYetkiliAdi(String yetkiliAdi) {
        this.yetkiliAdi = yetkiliAdi;
    }

    public String getYetkiliSoyadi() {
        return yetkiliSoyadi;
    }

    public void setYetkiliSoyadi(String yetkiliSoyadi) {
        this.yetkiliSoyadi = yetkiliSoyadi;
    }

    public String getTelefonNo() {
        return telefonNo;
    }

    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }

    public String getDahiliTelefonNo() {
        return dahiliTelefonNo;
    }

    public void setDahiliTelefonNo(String dahiliTelefonNo) {
        this.dahiliTelefonNo = dahiliTelefonNo;
    }

    public String getGsmNo() {
        return gsmNo;
    }

    public void setGsmNo(String gsmNo) {
        this.gsmNo = gsmNo;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public List<Hareket> getHareket() {
        return hareket;
    }

    public void setHareket(List<Hareket> hareket) {
        this.hareket = hareket;
    }

    public Boolean getAktif() {
        return aktif;
    }

    public void setAktif(Boolean aktif) {
        this.aktif = aktif;
    }

    public List<AracMapFirma> getAracMapFirmaList() {
        return aracMapFirmaList;
    }

    public void setAracMapFirmaList(List<AracMapFirma> aracMapFirmaList) {
        this.aracMapFirmaList = aracMapFirmaList;
    }
}
