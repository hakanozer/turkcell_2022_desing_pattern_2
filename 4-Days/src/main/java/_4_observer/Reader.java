package _4_observer;

public class Reader implements IReader {

    private INews news;
    private String nameSurname;

    public Reader( String nameSurname ) {
        this.nameSurname = nameSurname;
    }

    @Override
    public void addNews(INews news) {
        this.news = news;
        this.news.readerAdd(this);
    }

    @Override
    public void update() {
        System.out.println( news.getClass() + " - " + nameSurname + " News Send" );
    }

    @Override
    public void cancelNews() {
        news.readerDelete(this);
        System.out.println( news.getClass() + " - " + nameSurname + " Cancel News" );

    }

    public INews getNews() {
        return news;
    }

    public void setNews(INews news) {
        this.news = news;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }
}
