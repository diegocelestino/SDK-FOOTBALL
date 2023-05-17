package org.example.model.teamStatistics;

import org.example.model.player.League;
import org.example.model.teamInformation.Team;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TeamStatisticsData {
    private League league;
    private Team team;
    private String form;
    private Fixtures fixtures;


    public Fixtures getFixtures() {
        return fixtures;
    }
    public void setFixtures(Fixtures fixtures) {
        this.fixtures = fixtures;
    }
    public String getForm() {
        return form;
    }
    public void setForm(String form) {
        this.form = form;
    }
    public League getLeague() {
        return league;
    }
    public void setLeague(League league) {
        this.league = league;
    }
    public Team getTeam() {
        return team;
    }
    public void setTeam(Team team) {
        this.team = team;
    }

}
