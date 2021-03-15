package Lib;

import RequestModel.DataRequest;
import com.google.gson.Gson;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import org.apache.commons.io.IOUtils;

public class Lib {

    public static Gson gson = new Gson();

    public static String jsonResponse(String name, DataRequest dataRequest) {
        String query_url = "url" + name;
        Gson gson = new Gson();
        String json = gson.toJson(dataRequest);
        System.out.println("response" + json);
        String result = "";
        try {
            URL url = new URL(query_url);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setConnectTimeout(5000);
            conn.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.setRequestMethod("POST");
            try (OutputStream os = conn.getOutputStream()) {
                os.write(json.getBytes("UTF-8"));
            }
            try ( // read the response
                    InputStream in = new BufferedInputStream(conn.getInputStream())) {
                result = IOUtils.toString(in, "UTF-8");

                /*JSONObject myResponse = new JSONObject(result);
                System.out.println("jsonrpc- " + myResponse.getString("jsonrpc"));
                System.out.println("id- " + myResponse.getInt("id"));
                System.out.println("result- " + myResponse.getString("result"));*/
            }
            conn.disconnect();
        } catch (IOException e) {
            System.out.println(e);
        }
        if (result.equals("")) {
            return null;
        } else {
            System.out.println("request: " + result);
            return result;
        }
    }

}
