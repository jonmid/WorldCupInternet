package com.example.jonmid.worldcupinternet.Calendar.model;

public class Match extends RecyclerViewItem {
    private String img_local;
    private String local;
    private String img_visitor;
    private String visitor;
    private String hour;

    public Match(String img_local, String local, String img_visitor, String visitor, String hour) {
        this.img_local = img_local;
        this.local = local;
        this.img_visitor = img_visitor;
        this.visitor = visitor;
        this.hour = hour;
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
