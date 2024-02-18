package StrategyPattern;

public class SwingSword implements StrategyAttack {

    @Override
    public String attack() {
        String output = new String();
        return"swing a sword!";
    }
}
