package ResponseModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NotGirisiResponse {

    @SerializedName("ad_soyad")
    @Expose
    private String adSoyad;
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
    @SerializedName("ders_adi")
    @Expose
    private String dersAdi;
    @SerializedName("ogretmen_id")
    @Expose
    private String ogretmenId;
    @SerializedName("kullanici_adi")
    @Expose
    private String kullaniciAdi;
    @SerializedName("ogrenci_no")
    @Expose
    private String ogrenciNo;

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
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

    public String getDersAdi() {
        return dersAdi;
    }

    public void setDersAdi(String dersAdi) {
        this.dersAdi = dersAdi;
    }

    public String getOgretmenId() {
        return ogretmenId;
    }

    public void setOgretmenId(String ogretmenId) {
        this.ogretmenId = ogretmenId;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(String ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

}
