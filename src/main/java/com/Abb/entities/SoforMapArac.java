package com.Abb.entities;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "SoforMapArac")
public class SoforMapArac {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="SoforMapAracId", unique = true,nullable = false)
    private Long soforMapAracId;

   @ManyToOne(targetEntity = Sofor.class)
   @JoinColumn(name="soforId",foreignKey = @ForeignKey(name="FK_SoforlerMapAraclar_Sofor"))
    private Sofor sofor;

   @ManyToOne(targetEntity = Arac.class)
   @JoinColumn(name = "aracId", foreignKey = @ForeignKey(name="FK_SoforlerMapAraclar_Arac"))
    private Arac arac;

   @Column(name="KullaniciKod")
   private Short kullaniciKod;
   @Column(name = "KayitTarihi")
   private Timestamp kayitTarihi;

   @Column(name = "Aktif")
   private Boolean isAktif;
    public SoforMapArac() {
    }

    public SoforMapArac(Long soforMapAracId, Sofor sofor, Arac arac, Short kullaniciKod, Timestamp kayitTarihi, Boolean isAktif) {
        this.soforMapAracId = soforMapAracId;
        this.sofor = sofor;
        this.arac = arac;
        this.kullaniciKod = kullaniciKod;
        this.kayitTarihi = kayitTarihi;
        this.isAktif = isAktif;
    }

    public Long getSoforMapAracId() {
        return soforMapAracId;
    }

    public void setSoforMapAracId(Long soforMapAracId) {
        this.soforMapAracId = soforMapAracId;
    }

    public Sofor getSofor() {
        return sofor;
    }

    public void setSofor(Sofor sofor) {
        this.sofor = sofor;
    }

    public Arac getArac() {
        return arac;
    }

    public void setArac(Arac arac) {
        this.arac = arac;
    }

    public Timestamp getKayitTarihi() {
        return kayitTarihi;
    }

    public void setKayitTarihi(Timestamp kayitTarihi) {
        this.kayitTarihi = kayitTarihi;
    }

    public Short getKullaniciKod() {
        return kullaniciKod;
    }

    public void setKullaniciKod(Short kullaniciKod) {
        this.kullaniciKod = kullaniciKod;
    }

    public Boolean getAktif() {
        return isAktif;
    }

    public void setAktif(Boolean aktif) {
        isAktif = aktif;
    }
}
