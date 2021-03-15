package ResponseModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DonemDersListesiResponse {

    @SerializedName("ders_adi")
    @Expose
    private String dersAdi;
    @SerializedName("donem")
    @Expose
    private String donem;
    @SerializedName("kredi")
    @Expose
    private String kredi;
    @SerializedName("ad_soyad")
    @Expose
    private String adSoyad;

    public String getDersAdi() {
        return dersAdi;
    }

    public void setDersAdi(String dersAdi) {
        this.dersAdi = dersAdi;
    }

    public String getDonem() {
        return donem;
    }

    public void setDonem(String donem) {
        this.donem = donem;
    }

    public String getKredi() {
        return kredi;
    }

    public void setKredi(String kredi) {
        this.kredi = kredi;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

}
