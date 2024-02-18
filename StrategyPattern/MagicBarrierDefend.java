package StrategyPattern;

public class MagicBarrierDefend implements StrategyDefense {
    @Override
    public String defend() {
        String output = new String();
        return "creates a magic barrier for defense!";
    }
}
