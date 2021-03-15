package RequestModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoginRequest {

    @SerializedName("kullanici_adi")
    @Expose
    private String kullaniciAdi;
    @SerializedName("parola")
    @Expose
    private String parola;
    @SerializedName("kullanici_tip")
    @Expose
    private String kullaniciTip;

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public String getKullaniciTip() {
        return kullaniciTip;
    }

    public void setKullaniciTip(String kullaniciTip) {
        this.kullaniciTip = kullaniciTip;
    }

}
