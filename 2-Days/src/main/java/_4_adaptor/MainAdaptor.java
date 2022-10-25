package _4_adaptor;

import _4_adaptor.models.NewsData;

public class MainAdaptor {
    public static void main(String[] args) {

        Service service = new Service();
        NewsData newsData = service.news();
        newsData.getArticles().forEach( item -> {
            System.out.println( item.getTitle() );
        });
    }
}
