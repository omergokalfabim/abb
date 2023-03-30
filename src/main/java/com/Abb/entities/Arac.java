package com.Abb.entities;

import jakarta.persistence.*;

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
    private Set<Hareket> hareket;

    @OneToMany(mappedBy = "arac")
    private List<AracMapFirma> aracMapFirmaList;
    public Arac() {
    }

    public Arac(Long aracId, String plaka, Tarife tarife, AracSahibi aracSahibi, String aciklama, Set<Hareket> hareket, List<AracMapFirma> aracMapFirmaList) {
        this.aracId = aracId;
        this.plaka = plaka;
        this.tarife = tarife;
        this.aracSahibi = aracSahibi;
        this.aciklama = aciklama;
        this.hareket = hareket;
        this.aracMapFirmaList = aracMapFirmaList;
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

    public Set<Hareket> getHareket() {
        return hareket;
    }

    public void setHareket(Set<Hareket> hareket) {
        this.hareket = hareket;
    }

    public List<AracMapFirma> getAracMapFirmaList() {
        return aracMapFirmaList;
    }

    public void setAracMapFirmaList(List<AracMapFirma> aracMapFirmaList) {
        this.aracMapFirmaList = aracMapFirmaList;
    }
}
