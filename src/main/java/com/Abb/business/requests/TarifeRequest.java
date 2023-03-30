package com.Abb.business.requests;

public class TarifeRequest {

    private String tarifeAdi;
    private Double tarifeUcreti;

    public TarifeRequest() {
    }

    public TarifeRequest(String tarifeAdi, Double tarifeUcreti) {
        this.tarifeAdi = tarifeAdi;
        this.tarifeUcreti = tarifeUcreti;
    }

    public String getTarifeAdi() {
        return tarifeAdi;
    }

    public void setTarifeAdi(String tarifeAdi) {
        this.tarifeAdi = tarifeAdi;
    }

    public Double getTarifeUcreti() {
        return tarifeUcreti;
    }

    public void setTarifeUcreti(Double tarifeUcreti) {
        this.tarifeUcreti = tarifeUcreti;
    }
}
