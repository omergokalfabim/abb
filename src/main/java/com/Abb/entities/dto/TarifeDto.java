package com.Abb.entities.dto;

public class TarifeDto {
    private String tarifeAdi;

    private double tarifeUcreti;

    public TarifeDto() {
    }

    public TarifeDto(String tarifeAdi, double tarifeUcreti) {
        this.tarifeAdi = tarifeAdi;
        this.tarifeUcreti = tarifeUcreti;
    }

    public String getTarifeAdi() {
        return tarifeAdi;
    }

    public void setTarifeAdi(String tarifeAdi) {
        this.tarifeAdi = tarifeAdi;
    }

    public double getTarifeUcreti() {
        return tarifeUcreti;
    }

    public void setTarifeUcreti(double tarifeUcreti) {
        this.tarifeUcreti = tarifeUcreti;
    }
}
