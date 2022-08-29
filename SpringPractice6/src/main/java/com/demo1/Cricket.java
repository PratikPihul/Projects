package com.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Cricket {
    @Autowired
    @Qualifier("player1 ")
    Player player;

    public Cricket() {
    }

    public Cricket(Player player) {
        System.out.println("In Paramtaric Constructor");
        this.player = player;

    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        System.out.println("Setting Values");
        this.player = player;
    }

    @Override
    public String toString() {
        return "Cricket{" +
                "player=" + player +
                '}';
    }
}
