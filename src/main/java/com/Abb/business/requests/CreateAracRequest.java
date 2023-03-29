package com.Abb.business.requests;

public class CreateAracRequest {
    private String aciklama;
    private String plaka;
    private Long soforId;
    private Long aracSahibiId;
    private Long firmaId;
    private Long tarifeId;

    public CreateAracRequest() {
    }

    public CreateAracRequest(String aciklama, String plaka, Long soforId, Long aracSahibiId, Long firmaId, Long tarifeId) {
        this.aciklama = aciklama;
        this.plaka = plaka;
        this.soforId = soforId;
        this.aracSahibiId = aracSahibiId;
        this.firmaId = firmaId;
        this.tarifeId = tarifeId;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public String getPlaka() {
        return plaka;
    }

    public void setPlaka(String plaka) {
        this.plaka = plaka;
    }

    public Long getSoforId() {
        return soforId;
    }

    public void setSoforId(Long soforId) {
        this.soforId = soforId;
    }

    public Long getAracSahibiId() {
        return aracSahibiId;
    }

    public void setAracSahibiId(Long aracSahibiId) {
        this.aracSahibiId = aracSahibiId;
    }

    public Long getFirmaId() {
        return firmaId;
    }

    public void setFirmaId(Long firmaId) {
        this.firmaId = firmaId;
    }

    public Long getTarifeId() {
        return tarifeId;
    }

    public void setTarifeId(Long tarifeId) {
        this.tarifeId = tarifeId;
    }
}
