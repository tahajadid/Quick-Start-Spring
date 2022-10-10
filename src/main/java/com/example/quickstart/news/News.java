package com.example.quickstart.news;

public class News {

    private int idNews;
    private String idCountry;
    private String idLeague;
    private String title;
    private String description;

    public News(int idNews, String idCountry, String idLeague, String title, String description) {
        this.idNews = idNews;
        this.idCountry = idCountry;
        this.idLeague = idLeague;
        this.title = title;
        this.description = description;
    }

    public int getIdNews() {
        return idNews;
    }

    public String getIdCountry() {
        return idCountry;
    }

    public String getIdLeague() {
        return idLeague;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public void setIdNews(int idNews) {
        this.idNews = idNews;
    }

    public void setIdCountry(String idCountry) {
        this.idCountry = idCountry;
    }

    public void setIdLeague(String idLeague) {
        this.idLeague = idLeague;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
