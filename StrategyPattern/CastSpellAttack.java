package StrategyPattern;

public class CastSpellAttack implements StrategyAttack {

    @Override
    public String attack() {
        String output = new String();
        return"casts a spell!!";
    }
}
