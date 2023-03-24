package com.Abb.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "FIRMALAR")
public class Firma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @Column(name = "peronNo")
    private Integer peronNo;

    @Column(name = "firmaAdi")
    private String firmaAdi;


    @Column(name = "yetkiliAdi")
    private String yetkiliAdi;

    @Column(name = "yetkiliSoyadi")
    private String yetkiliSoyadi;

    @Column(name = "telefonNo")
    private String telefonNo;

    @Column(name = "dahiliTelefonNo")
    private String dahiliTelefonNo;

    @Column(name = "gsmNo")
    private String gsmNo;

    @Column(name = "aciklama")
    private String aciklama;

    @OneToMany(mappedBy = "firma")
    private List<Arac> araclar;

    @OneToMany(mappedBy = "firma")
    private List<Hareket> hareket;

    public Firma() {
    }

    public Firma(Long id, Integer peronNo, String firmaAdi, String yetkiliAdi, String yetkiliSoyadi, String telefonNo, String dahiliTelefonNo, String gsmNo, String aciklama, List<Arac> araclar, List<Hareket> hareket) {
        this.id = id;
        this.peronNo = peronNo;
        this.firmaAdi = firmaAdi;
        this.yetkiliAdi = yetkiliAdi;
        this.yetkiliSoyadi = yetkiliSoyadi;
        this.telefonNo = telefonNo;
        this.dahiliTelefonNo = dahiliTelefonNo;
        this.gsmNo = gsmNo;
        this.aciklama = aciklama;
        this.araclar = araclar;
        this.hareket = hareket;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public List<Arac> getAraclar() {
        return araclar;
    }

    public void setAraclar(List<Arac> araclar) {
        this.araclar = araclar;
    }

    public List<Hareket> getHareket() {
        return hareket;
    }

    public void setHareket(List<Hareket> hareket) {
        this.hareket = hareket;
    }
}
