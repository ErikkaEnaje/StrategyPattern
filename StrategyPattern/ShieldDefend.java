package StrategyPattern;

public class ShieldDefend implements StrategyDefense {
    @Override
    public String defend() {
        String output = new String();
        return "using a shield to defend!";
    }
}
