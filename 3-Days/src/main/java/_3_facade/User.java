package _3_facade;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.jsoup.Jsoup;

import java.util.HashMap;
import java.util.Map;

public class User implements IUser{

    @Override
    public String login(String email, String password) {
        String status = "";
        try {
            String url = "https://www.jsonbulut.com/json/userLogin.php";
            Map<String, String> hm = new HashMap<>();
            hm.put("ref", "d1becef32825e5c8b0fc1b096230400b");
            hm.put("userEmail", email);
            hm.put("userPass", password);
            hm.put("face", "no");

            String stData = Jsoup.connect(url).data(hm).timeout(30000).ignoreContentType(true).get().body().text();
            Gson gson = new Gson();
            JsonObject obj = gson.fromJson(stData, JsonObject.class);
            boolean durum = obj.get("user").getAsJsonArray().get(0).getAsJsonObject().get("durum").getAsBoolean();
            if (durum) {
                status = obj.get("user").getAsJsonArray().get(0).getAsJsonObject().get("bilgiler").getAsJsonObject().get("userId").getAsString();
            }
        }catch (Exception ex) {
            System.err.println("Login Error : " + ex);
        }
        return status;
    }

}
