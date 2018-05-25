package com.example.jonmid.worldcupinternet.Login.model;

public class Login {
    private boolean searchUser;
    private Integer id;
    private String user;
    private String password;
    private String name;
    private String email;

    public Login(boolean searchUser, Integer id, String user, String password, String name, String email) {
        this.searchUser = searchUser;
        this.id = id;
        this.user = user;
        this.password = password;
        this.name = name;
        this.email = email;
    }

    public boolean isSearchUser() {
        return searchUser;
    }

    public void setSearchUser(boolean searchUser) {
        this.searchUser = searchUser;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
