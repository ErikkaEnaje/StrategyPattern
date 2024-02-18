package StrategyPattern;

public class Wizard implements CharacterType {

    @Override
    public void defend() {
        MagicBarrierDefend magicbarrierdefend = new MagicBarrierDefend();
        System.out.println("Wizard " + magicbarrierdefend.defend());
    }

    @Override
    public void attack() {
        CastSpellAttack castspellattack = new CastSpellAttack();
        System.out.println("Wizard " + castspellattack.attack());
    }
}
