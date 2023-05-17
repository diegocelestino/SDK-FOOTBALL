package org.example.model.player;


public class Goals {
    private String total;
    private String conceded;
    private String assists;
    private String saves;

    public String getAssists() {
        return assists;
    }
    public void setAssists(String assists) {
        this.assists = assists;
    }
    public String getConceded() {
        return conceded;
    }

    public void setConceded(String conceded) {
        this.conceded = conceded;
    }

    public String getSaves() {
        return saves;
    }

    public void setSaves(String saves) {
        this.saves = saves;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

}
