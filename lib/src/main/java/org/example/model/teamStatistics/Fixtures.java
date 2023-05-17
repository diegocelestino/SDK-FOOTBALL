package org.example.model.teamStatistics;

public class Fixtures {
    private HomeAwayTotal played;
    private HomeAwayTotal wins;
    private HomeAwayTotal draws;
    private HomeAwayTotal loses;

    public HomeAwayTotal getDraws() {
        return draws;
    }
    public void setDraws(HomeAwayTotal draws) {
        this.draws = draws;
    }
    public HomeAwayTotal getLoses() {
        return loses;
    }
    public void setLoses(HomeAwayTotal loses) {
        this.loses = loses;
    }
    public HomeAwayTotal getPlayed() {
        return played;
    }
    public void setPlayed(HomeAwayTotal played) {
        this.played = played;
    }
    public HomeAwayTotal getWins() {
        return wins;
    }
    public void setWins(HomeAwayTotal wins) {
        this.wins = wins;
    }
    
}
