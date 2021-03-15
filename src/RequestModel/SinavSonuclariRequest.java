package RequestModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SinavSonuclariRequest {

    @SerializedName("ders_adi")
    @Expose
    private String dersAdi;
    @SerializedName("kredi")
    @Expose
    private String kredi;
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
    @SerializedName("butunleme")
    @Expose
    private String butunleme;
    @SerializedName("ogrenci_no")
    @Expose
    private String ogrenciNo;

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

    public String getButunleme() {
        return butunleme;
    }

    public void setButunleme(String butunleme) {
        this.butunleme = butunleme;
    }

    public String getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(String ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

}
