package _3_facade;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.jsoup.Jsoup;

import java.util.HashMap;
import java.util.Map;

public class Order implements IOrder {

    @Override
    public boolean sendOrder(String customerId, String productId) {
        boolean status = false;
        try {
            String url = "https://www.jsonbulut.com/json/orderForm.php";
            Map<String, String> hm = new HashMap<>();
            hm.put("ref", "d1becef32825e5c8b0fc1b096230400b");
            hm.put("customerId", customerId);
            hm.put("productId", productId);
            hm.put("html", productId);

            String stData = Jsoup.connect(url).data(hm).timeout(30000).ignoreContentType(true).get().body().text();
            Gson gson = new Gson();
            JsonObject obj = gson.fromJson(stData, JsonObject.class);
            status = obj.get("order").getAsJsonArray().get(0).getAsJsonObject().get("durum").getAsBoolean();
        }catch (Exception ex) {
            System.err.println("Login Error : " + ex);
        }
        return status;
    }

}
