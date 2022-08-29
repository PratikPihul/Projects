package com.autowiringdemo1;

public class Cricket {
      private WorldCup worldCup;

    public Cricket(WorldCup worldCup) {
        this.worldCup = worldCup;
    }

    public Cricket() {
    }

    public WorldCup getWorldCup() {
        return worldCup;
    }

    public void setWorldCup(WorldCup worldCup) {
        this.worldCup = worldCup;
    }

    @Override
    public String toString() {
        return "Cricket{" +
                "worldCup=" + worldCup +
                '}';
    }
}
