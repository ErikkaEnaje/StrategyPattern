package StrategyPattern;

public class Character {
    private CharacterType type;
    public Character(CharacterType type) {
        this.type = type;
    }

    public void defend(){
        type.defend();
    }

    public void attack() {
        type.attack();
    }
}
