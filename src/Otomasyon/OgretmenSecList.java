
package Otomasyon;

import java.util.HashMap;


public class OgretmenSecList {

    HashMap<String, String> ogretmenler = new HashMap<String,String>();

    public OgretmenSecList() {
    }
    
    

    public void ekle(String degisken, String deger) {
        ogretmenler.put(degisken, deger);
    }
    
    public String goster(String degisken) {
        return ogretmenler.get(degisken);
    }
    
}
