package com.Abb.business.requests;

public class HareketRequest {
    private String saat;
    private String tarih;
    private String aciklama;
    private Long aracId;
    private Long firmaId;
    private Long tarifeId;

    public HareketRequest() {
    }

    public HareketRequest(String saat, String tarih, String aciklama, Long aracId, Long firmaId, Long tarifeId) {
        this.saat = saat;
        this.tarih = tarih;
        this.aciklama = aciklama;
        this.aracId = aracId;
        this.firmaId = firmaId;
        this.tarifeId = tarifeId;
    }

    public String getSaat() {
        return saat;
    }

    public void setSaat(String saat) {
        this.saat = saat;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public Long getAracId() {
        return aracId;
    }

    public void setAracId(Long aracId) {
        this.aracId = aracId;
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
