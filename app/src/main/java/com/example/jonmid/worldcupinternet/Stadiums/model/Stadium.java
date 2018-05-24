package com.example.jonmid.worldcupinternet.Stadiums.model;

public class Stadium {
    private Integer id;
    private String name;
    private String description;
    private Integer star;
    private String url_img;

    public Stadium(Integer id, String name, String description, Integer star, String url_img) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.star = star;
        this.url_img = url_img;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getStar() {
        return star;
    }

    public void setStar(Integer star) {
        this.star = star;
    }

    public String getUrl_img() {
        return url_img;
    }

    public void setUrl_img(String url_img) {
        this.url_img = url_img;
    }
}
