package com.Abb.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "HAREKETLER")
public class Hareket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "HareketId")
    private Long hareketId;
    @Column(name = "Tarih", nullable = true)
    private String tarih;
    @Column(name = "Saat", nullable = true)
    private String saat;

    @ManyToOne(targetEntity = Arac.class)
    @JoinColumn(name = "arac_id", foreignKey = @ForeignKey(name = "FK_HAREKETLER_ARACLAR"))
    private Arac arac;

    @ManyToOne(targetEntity = Firma.class)
    @JoinColumn(name = "firma_id", foreignKey = @ForeignKey(name = "FK_HAREKETLER_FIRMALAR"))
    private Firma firma;

    @ManyToOne(targetEntity = Tarife.class)
    @JoinColumn(name = "tarife_id", foreignKey = @ForeignKey(name = "FK_HAREKETLER_TARIFELER"))
    private Tarife tarife;

    @Column(name = "Aciklama")
    private String aciklama;


    public Hareket() {
    }

    public Hareket(Long hareketId, String tarih, String saat, Arac arac, Firma firma, Tarife tarife, String aciklama) {
        this.hareketId = hareketId;
        this.tarih = tarih;
        this.saat = saat;
        this.arac = arac;
        this.firma = firma;
        this.tarife = tarife;
        this.aciklama = aciklama;
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
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }
}
