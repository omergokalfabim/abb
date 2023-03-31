package com.Abb.business.responses;

public class FirmaResponse {
    private Long firmaId;
    private Integer peronNo;
    private String firmaAdi;
    private String yetkiliAdi;
    private String yetkiliSoyadi;
    private String telefonNo;
    private String dahiliTelefonNo;
    private String gsmNo;
    private Boolean isAktif;

    private String aciklama;

    public FirmaResponse() {
    }

    public FirmaResponse(Long firmaId, Integer peronNo, String firmaAdi, String yetkiliAdi, String yetkiliSoyadi, String telefonNo, String dahiliTelefonNo, String gsmNo, Boolean isAktif, String aciklama) {
        this.firmaId = firmaId;
        this.peronNo = peronNo;
        this.firmaAdi = firmaAdi;
        this.yetkiliAdi = yetkiliAdi;
        this.yetkiliSoyadi = yetkiliSoyadi;
        this.telefonNo = telefonNo;
        this.dahiliTelefonNo = dahiliTelefonNo;
        this.gsmNo = gsmNo;
        this.isAktif = isAktif;
        this.aciklama = aciklama;
    }

    public Long getFirmaId() {
        return firmaId;
    }

    public void setFirmaId(Long firmaId) {
        this.firmaId = firmaId;
    }

    public Integer getPeronNo() {
        return peronNo;
    }

    public void setPeronNo(Integer peronNo) {
        this.peronNo = peronNo;
    }

    public String getFirmaAdi() {
        return firmaAdi;
    }

    public void setFirmaAdi(String firmaAdi) {
        this.firmaAdi = firmaAdi;
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

    public Boolean getAktif() {
        return isAktif;
    }

    public void setAktif(Boolean aktif) {
        isAktif = aktif;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }
}
