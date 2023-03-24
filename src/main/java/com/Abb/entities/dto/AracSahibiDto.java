package com.Abb.entities.dto;

public class AracSahibiDto {
    private String kimlikNumarasi;
    private String adi;
    private String soyadi;
    private String telefonNumarasi;
    private String plaka;

    public AracSahibiDto() {
    }

    public AracSahibiDto(String kimlikNumarasi, String adi, String soyadi, String telefonNumarasi, String plaka) {
        this.kimlikNumarasi = kimlikNumarasi;
        this.adi = adi;
        this.soyadi = soyadi;
        this.telefonNumarasi = telefonNumarasi;
        this.plaka = plaka;
    }

    public String getKimlikNumarasi() {
        return kimlikNumarasi;
    }

    public void setKimlikNumarasi(String kimlikNumarasi) {
        this.kimlikNumarasi = kimlikNumarasi;
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

    public String getTelefonNumarasi() {
        return telefonNumarasi;
    }

    public void setTelefonNumarasi(String telefonNumarasi) {
        this.telefonNumarasi = telefonNumarasi;
    }

    public String getPlaka() {
        return plaka;
    }

    public void setPlaka(String plaka) {
        this.plaka = plaka;
    }
}
