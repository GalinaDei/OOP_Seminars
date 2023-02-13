package Seminar_Game;

import Seminar_Game.Units.*;

public class Game_main {
    public static void main(String[] args) {
        Farmer farmer1 = new Farmer(1000, 50, 30, 20, 100, 100);
        farmer1.setName("Mary");
        System.out.println("Name: "+ farmer1.getName()+"; "+String.format("attack: %d; health: %d; speed: %d; accuracy: %d; food: %d; drink: %d",
                farmer1.attack(20, 20, 30),farmer1.getHealth(),farmer1.getSpeed(),farmer1.getAccuracy(),farmer1.getFood(),farmer1.getDrink()));

        Crossbow_man crossbowMan = new Crossbow_man(1000,40, 90, 90, 100, 0);
        crossbowMan.setName("Yan");
        crossbowMan.setArrows(farmer1.giveArrows());
        crossbowMan.setDrink(farmer1.getDrink());
        System.out.println("Name: "+ crossbowMan.getName()+"; "+String.format("attack: %d; health: %d; speed: %d; accuracy: %d; food: %d; drink: %d; cartridges: %d",
                crossbowMan.attack(40, 90, 90),crossbowMan.getHealth(),crossbowMan.getSpeed(),crossbowMan.getAccuracy(),crossbowMan.getFood(),crossbowMan.getDrink(), crossbowMan.getArrows()));

        Magician magician1 = new Magician(1000,20, 50, 40,100,100);
        magician1.setName("Margo");
        magician1.setMana(100);
        magician1.makeSpell();
        System.out.println("Name: "+ magician1.getName()+"; "+String.format("attack: %d; health: %d; speed: %d; accuracy: %d; food: %d; drink: %d; mana: %d",
                magician1.attack(20, 40, 50),magician1.getHealth(),magician1.getSpeed(),magician1.getAccuracy(),magician1.getFood(),magician1.getDrink(), magician1.getMana()));

        Monk monk1 = new Monk(1000, 20, 20, 50, 100, 100);
        monk1.setName("Saruman");
        monk1.makePrayer();
        System.out.println("Name: "+ monk1.getName()+"; "+String.format("attack: %d; health: %d; speed: %d; accuracy: %d; food: %d; drink: %d; prayer: %d",
                monk1.attack(20, 50, 20),monk1.getHealth(),monk1.getSpeed(),monk1.getAccuracy(),monk1.getFood(),monk1.getDrink(), monk1.makePrayer()));

        Robber robber1 = new Robber(1000,90,80,30,100,100);
        robber1.setName("Buba");
        System.out.println("Name: "+ robber1.getName()+"; "+String.format("attack: %d; health: %d; speed: %d; accuracy: %d; food: %d; drink: %d",
                robber1.attack(90, 30, 80),robber1.getHealth(),robber1.getSpeed(),robber1.getAccuracy(),robber1.getFood(),robber1.getDrink()));

        Sniper sniper1 = new Sniper(1000, 30, 90, 100, 10, 100);
        sniper1.setName("John");
        sniper1.setCartridges(farmer1.giveCartridge());
        sniper1.setFood(farmer1.getFood());
        System.out.println("Name: "+ sniper1.getName()+"; "+String.format("attack: %d; health: %d; speed: %d; accuracy: %d; food: %d; drink: %d; cartridges: %d",
                sniper1.attack(30, 100, 90),sniper1.getHealth(),sniper1.getSpeed(),sniper1.getAccuracy(),sniper1.getFood(),sniper1.getDrink(), sniper1.getCartridges()));

        Spearman spearman1 = new Spearman(1000,90,90,80,100,100);
        spearman1.setName("Ron");
        System.out.println("Name: "+ spearman1.getName()+"; "+String.format("attack: %d; health: %d; speed: %d; accuracy: %d; food: %d; drink: %d",
                spearman1.attack(30, 100, 90),spearman1.getHealth(),spearman1.getSpeed(),spearman1.getAccuracy(),spearman1.getFood(),spearman1.getDrink()));
    }
}
