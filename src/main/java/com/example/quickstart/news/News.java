package com.example.quickstart.news;

public class News {

    private int idNews;
    private String idCountry;
    private String idLeague;
    private String title;
    private String description;
    private String publishedDate;

    public News(int idNews, String idCountry, String idLeague, String title, String description, String publishedDate) {
        this.idNews = idNews;
        this.idCountry = idCountry;
        this.idLeague = idLeague;
        this.title = title;
        this.description = description;
        this.publishedDate = publishedDate;

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

    public String getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
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
