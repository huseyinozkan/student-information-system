package ResponseModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DonemSecimiResponse {

    @SerializedName("durum")
    @Expose
    private String durum;
    
    @SerializedName("donem")
    @Expose
    private String donem;

    public String getDurum() {
        return durum;
    }

    public void setDurum(String durum) {
        this.durum = durum;
    }
    
    public String getDonem() {
        return donem;
    }

    public void setDonem(String donem) {
        this.donem = donem;
    }

}
