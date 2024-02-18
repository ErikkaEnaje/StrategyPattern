package StrategyPattern;

public class AppGame {

    public static void main(String[] args) {
        Character knight = new Character(new Knight());
        Character wizard = new Character(new Wizard());
        Character archer = new Character(new Archer());

        // For the Knight When defense and attack
        knight.defend();
        System.out.println();
        knight.attack();

        // For the Wizard When defense and attack
        wizard.defend();
        System.out.println();
        wizard.attack();

        //For the Archer When defense and attack
        archer.defend();
        System.out.println();
        archer.attack();
    }
}
