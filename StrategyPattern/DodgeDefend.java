package StrategyPattern;

public class DodgeDefend implements StrategyDefense {

    @Override
    public String defend() {
        String output = new String();
            return"dodges to avoid attack!";
    }
}
