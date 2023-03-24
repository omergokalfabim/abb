package com.Abb.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Sofor")
public class Sofor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id",unique = true,nullable = false)
    private Long soforId;

    @Column(name="Adi")
    private String adi;

    @Column(name="Soyadi")
    private String soyadi;

    @Column(name="Telefon")
    private String telefon;

    @OneToOne
    @JoinColumn(name="arac_id")
    private Arac arac;

    public Sofor() {
    }

    public Sofor(Long soforId, String adi, String soyadi, String telefon, Arac arac) {
        this.soforId = soforId;
        this.adi = adi;
        this.soyadi = soyadi;
        this.telefon = telefon;
        this.arac = arac;
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

    public Arac getArac() {
        return arac;
    }

    public void setArac(Arac arac) {
        this.arac = arac;
    }
}
