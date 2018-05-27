package com.example.jonmid.worldcupinternet.News.model;

public class News {
    private Integer id;
    private String title;
    private String subtitle;
    private String url_news;

    public News(Integer id, String title, String subtitle, String url_news) {
        this.id = id;
        this.title = title;
        this.subtitle = subtitle;
        this.url_news = url_news;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getUrl_news() {
        return url_news;
    }

    public void setUrl_news(String url_news) {
        this.url_news = url_news;
    }
}
