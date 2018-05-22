package com.example.jonmid.worldcupinternet.Calendar.model;

import java.util.ArrayList;
import java.util.List;

public class Calendar extends RecyclerViewItem {
    private String day;
    private List<Match> matchs;

    public Calendar(String day, List<Match> matchs) {
        this.day = day;
        this.matchs = matchs;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public List<Match> getMatchs() {
        return matchs;
    }

    public void setMatchs(List<Match> matchs) {
        this.matchs = matchs;
    }
}
