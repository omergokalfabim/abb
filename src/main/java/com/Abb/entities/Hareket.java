package com.Abb.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "hareket")
public class Hareket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long hareketId;
    @Column(name="tarih",nullable = true)
    private String tarih;
    @Column(name="saat",nullable = true)
    private String saat;

    @ManyToOne(targetEntity = Arac.class, cascade = CascadeType.ALL)
    @JoinColumn(name="arac_id")
    private Arac arac;

    @ManyToOne(targetEntity = Firma.class, cascade =CascadeType.ALL)
    @JoinColumn(name = "firma_id")
    private Firma firma;

    @ManyToOne(targetEntity = Tarife.class, cascade = CascadeType.ALL)
    @JoinColumn(name="tarife_id")
    private Tarife tarife;

    @Column(name="aciklama")
    private String not;



    public Hareket() {
    }

    public Hareket(Long hareketId, String tarih, String saat, Arac arac, Firma firma, Tarife tarife, String not) {
        this.hareketId = hareketId;
        this.tarih = tarih;
        this.saat = saat;
        this.arac = arac;
        this.firma = firma;
        this.tarife = tarife;
        this.not = not;
    }

    public Long getHareketId() {
        return hareketId;
    }

    public void setHareketId(Long hareketId) {
        this.hareketId = hareketId;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

    public String getSaat() {
        return saat;
    }

    public void setSaat(String saat) {
        this.saat = saat;
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

    public Tarife getTarife() {
        return tarife;
    }

    public void setTarife(Tarife tarife) {
        this.tarife = tarife;
    }

    public String getAciklama() {
        return not;
    }

    public void setAciklama(String aciklama) {
        this.not = not;
    }
}
