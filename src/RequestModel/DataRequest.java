/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RequestModel;

import Lib.Public;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

/**
 *
 * @author huseyin
 */
public class DataRequest {
    
    @SerializedName("token")
    String Token;
    
    @SerializedName("kullanici_tip")
    String kullanici_tip;


    @SerializedName("data")
    Object Data;

    public DataRequest() {
        Data = null;
        if (Public.akademikResponse!=null) {
            Token = Public.akademikResponse.getToken();
            kullanici_tip = "akademik";
        }
        if (Public.idariResponse!=null) {
            Token = Public.idariResponse.getToken();
            kullanici_tip = "idari";
        }
        if (Public.ogrenciResponse!=null) {
            Token = Public.ogrenciResponse.getToken();
            kullanici_tip = "ogrenci";
        }

        Gson gson = new Gson();
        String json = gson.toJson(this);
        System.out.println(json);
    }

    public DataRequest(Object data) {
        Data = data;
        if (Public.akademikResponse!=null) {
            Token = Public.akademikResponse.getToken();
            kullanici_tip = "akademik";
        }
        if (Public.idariResponse!=null) {
            Token = Public.idariResponse.getToken();
            kullanici_tip = "idari";
        }
        if (Public.ogrenciResponse!=null) {
            Token = Public.ogrenciResponse.getToken();
            kullanici_tip = "ogrenci";
        }


        Gson gson = new Gson();
        String json = gson.toJson(this);
        System.out.println(json);
    }

    public String getKullanici_tip() {
        return kullanici_tip;
    }

    public void setKullanici_tip(String kullanici_tip) {
        this.kullanici_tip = kullanici_tip;
    }

    public Object getData() {
        return Data;
    }

    public void setData(Object data) {
        Data = data;
    }

    public String getToken() {
        return Token;
    }

    public void setToken(String token) {
        Token = token;
    }
    
}
