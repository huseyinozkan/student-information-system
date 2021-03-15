package ResponseModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DersAlmaResponse {

    @SerializedName("ders_id")
    @Expose
    private String dersId;
    @SerializedName("ders_adi")
    @Expose
    private String dersAdi;
    @SerializedName("kredi")
    @Expose
    private String kredi;
    @SerializedName("donem")
    @Expose
    private String donem;
    @SerializedName("gun")
    @Expose
    private String gun;
    @SerializedName("saati")
    @Expose
    private String saati;
    @SerializedName("ogretmen_id")
    @Expose
    private String ogretmenId;
    @SerializedName("sonuc")
    @Expose
    private String sonuc;
    
    public String getSonuc() {
        return sonuc;
    }

    public void setSonuc(String sonuc) {
        this.sonuc = sonuc;
    }

    public String getDersId() {
        return dersId;
    }

    public void setDersId(String dersId) {
        this.dersId = dersId;
    }

    public String getDersAdi() {
        return dersAdi;
    }

    public void setDersAdi(String dersAdi) {
        this.dersAdi = dersAdi;
    }

    public String getKredi() {
        return kredi;
    }

    public void setKredi(String kredi) {
        this.kredi = kredi;
    }

    public String getDonem() {
        return donem;
    }

    public void setDonem(String donem) {
        this.donem = donem;
    }

    public String getGun() {
        return gun;
    }

    public void setGun(String gun) {
        this.gun = gun;
    }

    public String getSaati() {
        return saati;
    }

    public void setSaati(String saati) {
        this.saati = saati;
    }

    public String getOgretmenId() {
        return ogretmenId;
    }

    public void setOgretmenId(String ogretmenId) {
        this.ogretmenId = ogretmenId;
    }

}
