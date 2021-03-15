package ResponseModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OgrenciDersProgramiResponse {

    @SerializedName("gun")
    @Expose
    private String gun;
    @SerializedName("ders_adi")
    @Expose
    private String dersAdi;
    @SerializedName("saati")
    @Expose
    private String saati;
    @SerializedName("kredi")
    @Expose
    private String kredi;
    @SerializedName("ad_soyad")
    @Expose
    private String adSoyad;
    @SerializedName("sonuc")
    @Expose
    private String sonuc;
    @SerializedName("ders_alma_id")
    @Expose
    private String dersAlmaId;
    @SerializedName("ders_id")
    @Expose
    private String dersId;
    @SerializedName("ogrenci_id")
    @Expose
    private String ogrenciId;
    @SerializedName("vize")
    @Expose
    private String vize;
    @SerializedName("final")
    @Expose
    private String _final;

    public String getGun() {
        return gun;
    }

    public void setGun(String gun) {
        this.gun = gun;
    }

    public String getDersAdi() {
        return dersAdi;
    }

    public void setDersAdi(String dersAdi) {
        this.dersAdi = dersAdi;
    }

    public String getSaati() {
        return saati;
    }

    public void setSaati(String saati) {
        this.saati = saati;
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

    public String getSonuc() {
        return sonuc;
    }

    public void setSonuc(String sonuc) {
        this.sonuc = sonuc;
    }

    public String getDersAlmaId() {
        return dersAlmaId;
    }

    public void setDersAlmaId(String dersAlmaId) {
        this.dersAlmaId = dersAlmaId;
    }

    public String getDersId() {
        return dersId;
    }

    public void setDersId(String dersId) {
        this.dersId = dersId;
    }

    public String getOgrenciId() {
        return ogrenciId;
    }

    public void setOgrenciId(String ogrenciId) {
        this.ogrenciId = ogrenciId;
    }

    public String getVize() {
        return vize;
    }

    public void setVize(String vize) {
        this.vize = vize;
    }

    public String getFinal() {
        return _final;
    }

    public void setFinal(String _final) {
        this._final = _final;
    }

}
