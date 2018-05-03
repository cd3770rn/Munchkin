package com.munchkin.game.cards;

public class PlayerRace extends Card {
    public PlayerRace(String name, String description){
        super(name, description);
    }

    public PlayerRace(){
        super();
    }

    @Override
    public String toString() {
        return "PlayerRace{" +
                "name='" + getName() + '\'' +
                ", description='" + getDescription() + '\'' +
                '}';
    }
}
