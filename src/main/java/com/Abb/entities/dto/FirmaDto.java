package com.Abb.entities.dto;

public class FirmaDto {
    private String firmaAdi;
    private int peronNo;
    private String yetkiliAdi;
    private String yetkiliSoyadi;
    private String telefonNo;
    private String dahiliTelefonNo;
    private String gsmNo;
    private String aciklama;

    public FirmaDto() {
    }

    public FirmaDto(String firmaAdi, int peronNo, String yetkiliAdi, String yetkiliSoyadi, String telefonNo, String dahiliTelefonNo, String gsmNo, String aciklama) {
        this.firmaAdi = firmaAdi;
        this.peronNo = peronNo;
        this.yetkiliAdi = yetkiliAdi;
        this.yetkiliSoyadi = yetkiliSoyadi;
        this.telefonNo = telefonNo;
        this.dahiliTelefonNo = dahiliTelefonNo;
        this.gsmNo = gsmNo;
        this.aciklama = aciklama;
    }

    public String getFirmaAdi() {
        return firmaAdi;
    }

    public void setFirmaAdi(String firmaAdi) {
        this.firmaAdi = firmaAdi;
    }

    public int getPeronNo() {
        return peronNo;
    }

    public void setPeronNo(int peronNo) {
        this.peronNo = peronNo;
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
}
