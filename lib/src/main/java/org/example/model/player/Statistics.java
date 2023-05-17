package org.example.model.player;

import org.example.model.teamInformation.Team;

public class Statistics {
    private Team team;
    private League league;
    private Games games;
    private Substitutes substitutes;
    private Shots shots;
    private Goals goals;
    private Passes passes;
    private Tackles tackles;
    private Duels duels;
    private Dribbles dribbles;
    private Fouls fouls;
    private Cards cards;
    private Penalty penalty;

    public Cards getCards() {
        return cards;
    }
    public void setCards(Cards cards) {
        this.cards = cards;
    }
    public Dribbles getDribbles() {
        return dribbles;
    }
    public void setDribbles(Dribbles dribbles) {
        this.dribbles = dribbles;
    }
    public Duels getDuels() {
        return duels;
    }
    public void setDuels(Duels duels) {
        this.duels = duels;
    }
    public Fouls getFouls() {
        return fouls;
    }
    public void setFouls(Fouls fouls) {
        this.fouls = fouls;
    }
    public Games getGames() {
        return games;
    }
    public void setGames(Games games) {
        this.games = games;
    }
    public Goals getGoals() {
        return goals;
    }
    public void setGoals(Goals goals) {
        this.goals = goals;
    }
    public League getLeague() {
        return league;
    }
    public void setLeague(League league) {
        this.league = league;
    }
    public Passes getPasses() {
        return passes;
    }
    public void setPasses(Passes passes) {
        this.passes = passes;
    }
    public Penalty getPenalty() {
        return penalty;
    }
    public void setPenalty(Penalty penalty) {
        this.penalty = penalty;
    }
    public Shots getShots() {
        return shots;
    }
    public void setShots(Shots shots) {
        this.shots = shots;
    }
    public Substitutes getSubstitutes() {
        return substitutes;
    }
    public void setSubstitutes(Substitutes substitutes) {
        this.substitutes = substitutes;
    }
    public Tackles getTackles() {
        return tackles;
    }
    public void setTackles(Tackles tackles) {
        this.tackles = tackles;
    }
    public Team getTeam() {
        return team;
    }
    public void setTeam(Team team) {
        this.team = team;
    }
    
    
}
