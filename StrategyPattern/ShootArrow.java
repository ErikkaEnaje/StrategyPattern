package StrategyPattern;

public class ShootArrow implements StrategyAttack {

    @Override
    public String attack(){
        String output = new String();
            return"shoots an arrow!";
    }
}
