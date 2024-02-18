package StrategyPattern;

public class Knight implements CharacterType{

    @Override
    public void defend() {
        ShieldDefend shielddefend = new ShieldDefend();
        DodgeDefend dodgedefend = new DodgeDefend();
        MagicBarrierDefend magicbarrierdefend = new MagicBarrierDefend();
        System.out.println("\nKnight " + shielddefend.defend());
        System.out.println("Knight " + dodgedefend.defend());
        System.out.println("Knight " + magicbarrierdefend.defend());
    }

    @Override
    public void attack() {
        SwingSword swingsword = new SwingSword();
        System.out.println("Knight " + swingsword.attack());
    }
}
