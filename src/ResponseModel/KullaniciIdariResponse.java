package ResponseModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class KullaniciIdariResponse {

    @SerializedName("idari_id")
    @Expose
    private String idariId;
    @SerializedName("token")
    @Expose
    private String token;
    @SerializedName("kullanici_adi")
    @Expose
    private String kullaniciAdi;
    @SerializedName("sifre")
    @Expose
    private String sifre;
    @SerializedName("ad_soyad")
    @Expose
    private String adSoyad;
    @SerializedName("telefon")
    @Expose
    private String telefon;
    @SerializedName("mail")
    @Expose
    private String mail;
    @SerializedName("il")
    @Expose
    private String il;
    @SerializedName("ilce")
    @Expose
    private String ilce;
    @SerializedName("adres")
    @Expose
    private String adres;

    public String getIdariId() {
        return idariId;
    }

    public void setIdariId(String idariId) {
        this.idariId = idariId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
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

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
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

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

}
