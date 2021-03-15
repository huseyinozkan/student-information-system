package RequestModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AkademikRequest {

    @SerializedName("ogretmen_id")
    @Expose
    private String id;
    @SerializedName("ad_soyad")
    @Expose
    private String adSoyad;
    @SerializedName("kullanici_adi")
    @Expose
    private String kullaniciAdi;
    @SerializedName("sifre")
    @Expose
    private String sifre;
    @SerializedName("tc")
    @Expose
    private String tc;
    @SerializedName("brans")
    @Expose
    private String brans;
    @SerializedName("mail")
    @Expose
    private String mail;
    @SerializedName("telefon")
    @Expose
    private String telefon;
    @SerializedName("il")
    @Expose
    private String il;
    @SerializedName("ilce")
    @Expose
    private String ilce;
    @SerializedName("dogum_tarihi")
    @Expose
    private String dogumTarihi;
    @SerializedName("filtre")
    @Expose
    private String filtre;
    
    public String getFiltre() {
        return filtre;
    }

    public void setFiltre(String filtre) {
        this.filtre = filtre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }

    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
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
