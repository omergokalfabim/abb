package com.Abb.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Arac")
public class Arac {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "aracId", nullable = false, unique = true)
    private Long aracId;

    @ManyToOne(targetEntity = Firma.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "firma_id")
    private Firma firma;

    @Column(name = "plaka")
    private String plaka;

    @ManyToOne(targetEntity = Tarife.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "tarife_id")
    private Tarife tarife;

    @ManyToOne(targetEntity = AracSahibi.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "aracSahibi_id")
    private AracSahibi aracSahibi;

    @OneToOne(mappedBy = "arac", cascade = CascadeType.ALL)
    @JoinColumn(name = "sofor_id")
    private Sofor sofor;

    @Column(name = "aciklama")
    private String aciklama;

    @OneToMany(mappedBy = "arac")
    private List<Hareket> hareket;

    public Arac() {
    }

    public Arac(Long aracId, Firma firma, String plaka, Tarife tarife, AracSahibi aracSahibi, Sofor sofor, String aciklama, List<Hareket> hareket) {
        this.aracId = aracId;
        this.firma = firma;
        this.plaka = plaka;
        this.tarife = tarife;
        this.aracSahibi = aracSahibi;
        this.sofor = sofor;
        this.aciklama = aciklama;
        this.hareket = hareket;
    }

    public Long getAracId() {
        return aracId;
    }

    public void setAracId(Long aracId) {
        this.aracId = aracId;
    }

    public Firma getFirma() {
        return firma;
    }

    public void setFirma(Firma firma) {
        this.firma = firma;
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

    public Sofor getSofor() {
        return sofor;
    }

    public void setSofor(Sofor sofor) {
        this.sofor = sofor;
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
}
