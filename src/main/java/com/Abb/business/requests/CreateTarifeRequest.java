package com.Abb.business.requests;

public class CreateTarifeRequest {

    private String tarifeAdi;
    private Double tarifeUcreti;

    public CreateTarifeRequest() {
    }

    public CreateTarifeRequest(String tarifeAdi, Double tarifeUcreti) {
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
