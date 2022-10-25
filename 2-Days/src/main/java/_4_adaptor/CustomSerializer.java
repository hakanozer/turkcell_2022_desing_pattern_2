package _4_adaptor;

import _4_adaptor.models.NewsData;
import com.google.gson.Gson;

public class CustomSerializer<T> {

    public NewsData fncSerialize(String data) {
        try {
            Gson gson = new Gson();
            NewsData newsData = gson.fromJson(data, NewsData.class);
            return newsData;
        }catch (Exception ex) {
            System.err.println("fncSerialize Error : " + ex);
        }
        return null;
    }

}
