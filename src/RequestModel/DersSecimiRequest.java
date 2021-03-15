package RequestModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DersSecimiRequest {

    @SerializedName("ders_id")
    @Expose
    private String dersId;
    @SerializedName("ogrenci_no")
    @Expose
    private String ogrenciNo;

    public String getDersId() {
        return dersId;
    }

    public void setDersId(String dersId) {
        this.dersId = dersId;
    }

    public String getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(String ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

}
