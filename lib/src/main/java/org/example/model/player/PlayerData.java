package org.example.model.player;

import java.util.List;

public class PlayerData {
    private Player player;
    private List<Statistics> statistics;

    public Player getPlayer() {
        return player;
    }
    public void setPlayer(Player player) {
        this.player = player;
    }
    public List<Statistics> getStatistics() {
        return statistics;
    }
    public void setStatistics(List<Statistics> statistics) {
        this.statistics = statistics;
    }
    
}
