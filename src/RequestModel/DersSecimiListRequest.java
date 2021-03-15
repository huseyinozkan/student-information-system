package RequestModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DersSecimiListRequest {

    @SerializedName("ogrenci_no")
    @Expose
    private String ogrenciNo;

    @SerializedName("ders_alma_id")
    @Expose
    private String dersAlmaId;

    public String getDersAlmaId() {
        return dersAlmaId;
    }

    public void setDersAlmaId(String dersAlmaId) {
        this.dersAlmaId = dersAlmaId;
    }

    public String getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(String ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

}
