/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ResponseModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 *
 * @author huseyin
 */
public class ErrorResponse {

    @SerializedName("error")
    @Expose
    private Boolean Error;
    @SerializedName("message")
    @Expose
    private String Message;
    @SerializedName("code")
    @Expose
    private Integer Code;

    public Boolean getError() {
        return Error;
    }

    public void setError(Boolean error) {
        Error = error;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public Integer getCode() {
        return Code;
    }

    public void setCode(Integer code) {
        Code = code;
    }

}
