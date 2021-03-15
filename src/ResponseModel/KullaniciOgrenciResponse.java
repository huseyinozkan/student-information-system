package ResponseModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class KullaniciOgrenciResponse {

    @SerializedName("ogrenci_id")
    @Expose
    private String ogrenciId;
    @SerializedName("token")
    @Expose
    private String token;
    @SerializedName("ogrenci_no")
    @Expose
    private String ogrenciNo;
    @SerializedName("ad_soyad")
    @Expose
    private String adSoyad;
    @SerializedName("tc")
    @Expose
    private String tc;
    @SerializedName("sifre")
    @Expose
    private String sifre;
    @SerializedName("telefon")
    @Expose
    private String telefon;
    @SerializedName("mail")
    @Expose
    private String mail;
    @SerializedName("adres")
    @Expose
    private String adres;
    @SerializedName("bolum")
    @Expose
    private String bolum;
    @SerializedName("sinif")
    @Expose
    private String sinif;
    @SerializedName("il")
    @Expose
    private String il;
    @SerializedName("ilce")
    @Expose
    private String ilce;
    @SerializedName("dogum_tarihi")
    @Expose
    private String dogumTarihi;

    public String getOgrenciId() {
        return ogrenciId;
    }

    public void setOgrenciId(String ogrenciId) {
        this.ogrenciId = ogrenciId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(String ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }

    public String getIl() {
        return il;
    }

    public void setIl(String il) {
        this.il = il;
    }

    public String getIlce() {
        return ilce;
    }

    public void setIlce(String ilce) {
        this.ilce = ilce;
    }

    public String getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(String dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

}
