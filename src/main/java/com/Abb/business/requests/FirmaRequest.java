package com.Abb.business.requests;

public class FirmaRequest {
    private Long firmaId;
    private int peronNo;
    private String adi;
    private String yetkiliAdi;
    private String yetkiliSoyadi;
    private String telefonNo;
    private String dahiliTelefonNo;
    private String gsmNo;
    private String aciklama;
    private Boolean aktifPasif;

    private Short kullaniciKod;
    private Boolean kayitTarihi;
    public FirmaRequest() {
    }

    public FirmaRequest(Long firmaId, int peronNo, String adi, String yetkiliAdi, String yetkiliSoyadi, String telefonNo, String dahiliTelefonNo, String gsmNo, String aciklama, Boolean aktifPasif, Short kullaniciKod, Boolean kayitTarihi) {
        this.firmaId = firmaId;
        this.peronNo = peronNo;
        this.adi = adi;
        this.yetkiliAdi = yetkiliAdi;
        this.yetkiliSoyadi = yetkiliSoyadi;
        this.telefonNo = telefonNo;
        this.dahiliTelefonNo = dahiliTelefonNo;
        this.gsmNo = gsmNo;
        this.aciklama = aciklama;
        this.aktifPasif = aktifPasif;
        this.kullaniciKod = kullaniciKod;
        this.kayitTarihi = kayitTarihi;
    }

    public Long getFirmaId() {
        return firmaId;
    }

    public void setFirmaId(Long firmaId) {
        this.firmaId = firmaId;
    }

    public int getPeronNo() {
        return peronNo;
    }

    public void setPeronNo(int peronNo) {
        this.peronNo = peronNo;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
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

    public Boolean getAktifPasif() {
        return aktifPasif;
    }

    public void setAktifPasif(Boolean aktifPasif) {
        this.aktifPasif = aktifPasif;
    }

    public Short getKullaniciKod() {
        return kullaniciKod;
    }

    public void setKullaniciKod(Short kullaniciKod) {
        this.kullaniciKod = kullaniciKod;
    }

    public Boolean getKayitTarihi() {
        return kayitTarihi;
    }

    public void setKayitTarihi(Boolean kayitTarihi) {
        this.kayitTarihi = kayitTarihi;
    }
}
