package com.demo1;

public class Player {
    private String playerName;
    private String team;
    private int centuries;
    private int halfCenturies;

    public Player() {
    }

    public Player(String playerName, String team, int centuries, int halfCenturies) {
        this.playerName = playerName;
        this.team = team;
        this.centuries = centuries;
        this.halfCenturies = halfCenturies;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getCenturies() {
        return centuries;
    }

    public void setCenturies(int centuries) {
        this.centuries = centuries;
    }

    public int getHalfCenturies() {
        return halfCenturies;
    }

    public void setHalfCenturies(int halfCenturies) {
        this.halfCenturies = halfCenturies;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerName='" + playerName + '\'' +
                ", team='" + team + '\'' +
                ", centuries=" + centuries +
                ", halfCenturies=" + halfCenturies +
                '}';
    }
}
