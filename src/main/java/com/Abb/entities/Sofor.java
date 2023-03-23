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
    private String soforAdi;

    @Column(name="Soyadi")
    private String soforSoyadi;

    @Column(name="Telefon")
    private String soforTelefonNo;

    @OneToOne
    @JoinColumn(name="arac_id")
    private Arac arac;

    public Sofor() {
    }

    public Sofor(long soforId, String soforAdi, String soforSoyadi, String soforTelefonNo, Arac arac) {
        this.soforId = soforId;
        this.soforAdi = soforAdi;
        this.soforSoyadi = soforSoyadi;
        this.soforTelefonNo = soforTelefonNo;
        this.arac = arac;
    }

    public long getSoforId() {
        return soforId;
    }

    public void setSoforId(long soforId) {
        this.soforId = soforId;
    }

    public String getSoforAdi() {
        return soforAdi;
    }

    public void setSoforAdi(String soforAdi) {
        this.soforAdi = soforAdi;
    }

    public String getSoforSoyadi() {
        return soforSoyadi;
    }

    public void setSoforSoyadi(String soforSoyadi) {
        this.soforSoyadi = soforSoyadi;
    }

    public String getSoforTelefonNo() {
        return soforTelefonNo;
    }

    public void setSoforTelefonNo(String soforTelefonNo) {
        this.soforTelefonNo = soforTelefonNo;
    }

    public Arac getArac() {
        return arac;
    }

    public void setArac(Arac arac) {
        this.arac = arac;
    }
}
