package ResponseModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OgretmenKimlikResponse {

    @SerializedName("ad_soyad")
    @Expose
    private String adSoyad;
    @SerializedName("tc")
    @Expose
    private String tc;
    @SerializedName("brans")
    @Expose
    private String brans;
    @SerializedName("telefon")
    @Expose
    private String telefon;

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

    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

}
