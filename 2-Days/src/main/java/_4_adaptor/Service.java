package _4_adaptor;

import _4_adaptor.models.NewsData;
import org.jsoup.Jsoup;

public class Service {

    public NewsData news() {

       try {
           String url = "https://newsapi.org/v2/top-headlines?country=tr&category=business&apiKey=38a9e086f10b445faabb4461c4aa71f8";
           String stData = Jsoup.connect(url).timeout(30000).ignoreContentType(true).get().body().text();
           AdaptorSerializer serializer = new AdaptorSerializer();
           return serializer.fncSerialize(stData);
       }catch (Exception ex) {
           System.err.println("Error : " + ex);
       }
        return null;
    }



}
