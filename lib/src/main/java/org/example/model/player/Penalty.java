package org.example.model.player;

public class Penalty {
    private String won;
    private String commited;
    private String scored;
    private String missed;
    private String saved;

    public String getCommited() {
        return commited;
    }
    public void setCommited(String commited) {
        this.commited = commited;
    }
    public String getMissed() {
        return missed;
    }

    public void setMissed(String missed) {
        this.missed = missed;
    }
    public String getSaved() {
        return saved;
    }
    public void setSaved(String saved) {
        this.saved = saved;
    }
    public String getScored() {
        return scored;
    }
    public void setScored(String scored) {
        this.scored = scored;
    }
    public String getWon() {
        return won;
    }
    public void setWon(String won) {
        this.won = won;
    }
}
