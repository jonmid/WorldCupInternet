package com.example.jonmid.worldcupinternet.Calendar.model;

import java.util.ArrayList;
import java.util.List;

public class Calendar {

    public static final int TITLE_TYPE = 1;
    public static final int MATCH_TYPE = 0;

    private Integer wType;
    private String day;
    private String img_local;
    private String local;
    private String img_visitor;
    private String visitor;
    private String hour;

    public Integer getwType() {
        return wType;
    }

    public void setwType(Integer wType) {
        this.wType = wType;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getImg_local() {
        return img_local;
    }

    public void setImg_local(String img_local) {
        this.img_local = img_local;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getImg_visitor() {
        return img_visitor;
    }

    public void setImg_visitor(String img_visitor) {
        this.img_visitor = img_visitor;
    }

    public String getVisitor() {
        return visitor;
    }

    public void setVisitor(String visitor) {
        this.visitor = visitor;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }
}
