package com.bluemorphost.demo;

import javax.persistence.*;

@Entity
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String teamName;

    public String getTeamActivity() {
        return teamActivity;
    }

    public void setTeamActivity(String teamActivity) {
        this.teamActivity = teamActivity;
    }

    private String teamActivity;

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
}
