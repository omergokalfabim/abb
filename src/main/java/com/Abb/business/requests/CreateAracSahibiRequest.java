package com.Abb.business.requests;

public class CreateAracSahibiRequest {
    private String adi;
    private String soyadi;
    private String kimlikNo;
    private String telefonNo;
    private boolean isSahip;

    public CreateAracSahibiRequest() {
    }

    public CreateAracSahibiRequest(String adi, String soyadi, String kimlikNo, String telefonNo, boolean isSahip) {
        this.adi = adi;
        this.soyadi = soyadi;
        this.kimlikNo = kimlikNo;
        this.telefonNo = telefonNo;
        this.isSahip = isSahip;
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

    public String getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(String kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public String getTelefonNo() {
        return telefonNo;
    }

    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }

    public boolean isSahip() {
        return isSahip;
    }

    public void setSahip(boolean sahip) {
        isSahip = sahip;
    }
}
