package com.Abb.entities.dto;

public class SoforDto {
    private String soforAdi;
    private String soforSoyadi;
    private String soforTelefonNo;

    public SoforDto() {
    }

    public SoforDto(String soforAdi, String soforSoyadi, String soforTelefonNo) {
        this.soforAdi = soforAdi;
        this.soforSoyadi = soforSoyadi;
        this.soforTelefonNo = soforTelefonNo;
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
}
