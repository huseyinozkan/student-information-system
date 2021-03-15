/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ResponseModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.awt.Component;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author huseyin
 */
public class DataResponse<T> {

    @SerializedName("data")
    @Expose
    private List<T> data = null;
    @SerializedName("error")
    @Expose
    private ErrorResponse error;

    public List<T> getData(Component cmpn) {
        if (getError().getError()) {
            if (getError().getCode().equals(1002)) {
                JOptionPane.showMessageDialog(cmpn, getError().getMessage());
            }
            return null;
        } else {
            return data;
        }
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public ErrorResponse getError() {
        return error;
    }

    public void setError(ErrorResponse error) {
        this.error = error;
    }

}
