package com.munchkin.game.cards;

public class PlayerClass extends Card{
    public PlayerClass(String name, String description){
        super(name, description);
    }

    public PlayerClass(){
        super();
    }

    @Override
    public String toString() {
        return "PlayerClass{" +
                "name='" + getName() + '\'' +
                ", description='" + getDescription() + '\'' +
                '}';
    }
}
