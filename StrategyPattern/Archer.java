package StrategyPattern;

public class Archer implements CharacterType{

    @Override
    public void defend() {
        ShieldDefend shielddefend = new ShieldDefend();
        System.out.println("Archer " + shielddefend.defend());
    }

    @Override
    public void attack() {
        ShootArrow shootarrow = new ShootArrow();
        System.out.println("Archer " + shootarrow.attack());
    }
}
