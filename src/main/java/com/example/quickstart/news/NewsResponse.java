package com.example.quickstart.news;

import java.util.List;

public class NewsResponse {

    private int page;
    private List<News> results;

    public NewsResponse(int page, List<News> results) {
        this.page = page;
        this.results = results;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public List<News> getResults() {
        return results;
    }

    public void setResults(List<News> results) {
        this.results = results;
    }
}
