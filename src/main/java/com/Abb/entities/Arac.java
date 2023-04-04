package com.Abb.entities;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "ARACLAR")
public class Arac {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AracId", nullable = false, unique = true)
    private Long aracId;

    @Column(name = "Plaka")
    private String plaka;

    @ManyToOne(targetEntity = Tarife.class)
    @JoinColumn(name = "tarifeId", foreignKey = @ForeignKey(name = "FK_ARACLAR_TARIFELER"))
    private Tarife tarife;

    @ManyToOne
    @JoinColumn(name = "aracSahibiId", foreignKey = @ForeignKey(name = "FK_ARACLAR_ARAC_SAHIPLERI"))
    private AracSahibi aracSahibi;

    @Column(name = "Aciklama")
    private String aciklama;

    @OneToMany(mappedBy = "arac")
    private List<Hareket> hareket;

    @Column(name = "KullaniciKod")
    private Short kullaniciKod;

    @Column(name = "KayitTarihi")
    private Timestamp kayitTarihi;

    @OneToMany(mappedBy = "arac")
    private List<AracMapFirma> aracMapFirma;

    public Arac() {
    }

    public Arac(Long aracId, String plaka, Tarife tarife, AracSahibi aracSahibi, String aciklama, List<Hareket> hareket, Short kullaniciKod, Timestamp kayitTarihi, List<AracMapFirma> aracMapFirma) {
        this.aracId = aracId;
        this.plaka = plaka;
        this.tarife = tarife;
        this.aracSahibi = aracSahibi;
        this.aciklama = aciklama;
        this.hareket = hareket;
        this.kullaniciKod = kullaniciKod;
        this.kayitTarihi = kayitTarihi;
        this.aracMapFirma = aracMapFirma;
    }

    public Long getAracId() {
        return aracId;
    }

    public void setAracId(Long aracId) {
        this.aracId = aracId;
    }

    public String getPlaka() {
        return plaka;
    }

    public void setPlaka(String plaka) {
        this.plaka = plaka;
    }

    public Tarife getTarife() {
        return tarife;
    }

    public void setTarife(Tarife tarife) {
        this.tarife = tarife;
    }

    public AracSahibi getAracSahibi() {
        return aracSahibi;
    }

    public void setAracSahibi(AracSahibi aracSahibi) {
        this.aracSahibi = aracSahibi;
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

    public List<AracMapFirma> getAracMapFirma() {
        return aracMapFirma;
    }

    public void setAracMapFirma(List<AracMapFirma> aracMapFirma) {
        this.aracMapFirma = aracMapFirma;
    }
}
