package com.example.jonmid.worldcupinternet.Groups.model;

public class Group {
    private String group;
    private String team1;
    private String team2;
    private String team3;
    private String team4;
    private String team_img1;
    private String team_img2;
    private String team_img3;
    private String team_img4;

    public Group(String group, String team1, String team2, String team3, String team4, String team_img1, String team_img2, String team_img3, String team_img4) {
        this.group = group;
        this.team1 = team1;
        this.team2 = team2;
        this.team3 = team3;
        this.team4 = team4;
        this.team_img1 = team_img1;
        this.team_img2 = team_img2;
        this.team_img3 = team_img3;
        this.team_img4 = team_img4;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getTeam1() {
        return team1;
    }

    public void setTeam1(String team1) {
        this.team1 = team1;
    }

    public String getTeam2() {
        return team2;
    }

    public void setTeam2(String team2) {
        this.team2 = team2;
    }

    public String getTeam3() {
        return team3;
    }

    public void setTeam3(String team3) {
        this.team3 = team3;
    }

    public String getTeam4() {
        return team4;
    }

    public void setTeam4(String team4) {
        this.team4 = team4;
    }

    public String getTeam_img1() {
        return team_img1;
    }

    public void setTeam_img1(String team_img1) {
        this.team_img1 = team_img1;
    }

    public String getTeam_img2() {
        return team_img2;
    }

    public void setTeam_img2(String team_img2) {
        this.team_img2 = team_img2;
    }

    public String getTeam_img3() {
        return team_img3;
    }

    public void setTeam_img3(String team_img3) {
        this.team_img3 = team_img3;
    }

    public String getTeam_img4() {
        return team_img4;
    }

    public void setTeam_img4(String team_img4) {
        this.team_img4 = team_img4;
    }
}
