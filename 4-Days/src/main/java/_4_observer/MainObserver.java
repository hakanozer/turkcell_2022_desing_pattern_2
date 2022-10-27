package _4_observer;

public class MainObserver {
    public static void main(String[] args) {

        ANews news = new ANews();

        Reader r1 = new Reader("Ali Bilmem");
        r1.addNews(news);

        Reader r2 = new Reader("Zehra Bilsin");
        r2.addNews(news);
        r2.addNews(news);
        r2.addNews(news);
        r2.addNews(news);
        r2.addNews(news);

        Reader r3 = new Reader("Ahmet Bilki");
        r3.addNews(news);

        news.newsSend();
        System.out.println("============================");

        news.readerDelete(r3);
        news.newsSend();
        System.out.println("============================");

    }
}
