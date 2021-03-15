package ResponseModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OgrenciKimlikResponse {

    @SerializedName("ad_soyad")
    @Expose
    private String adSoyad;
    @SerializedName("sinif")
    @Expose
    private String sinif;
    @SerializedName("bolum")
    @Expose
    private String bolum;
    @SerializedName("ogrenci_no")
    @Expose
    private String ogrenciNo;
    @SerializedName("tc")
    @Expose
    private String tc;
    @SerializedName("mail")
    @Expose
    private String mail;
    @SerializedName("telefon")
    @Expose
    private String telefon;

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(String ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
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

}
