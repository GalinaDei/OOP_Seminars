package Seminar_Game;

import Seminar_Game.Units.*;

public class Game_main {
    public static void main(String[] args) {
        Farmer farmer1 = new Farmer("");
        farmer1.setName("John");
        farmer1.setAttack(50,30,30);
        System.out.println("Name: "+ farmer1.getName()+"; "+String.format("attack: %d; health: %d; damage: %d; strength: %d; speed: %d;" +
                        " accuracy: %d; food: %d; drink: %d; def: %d", farmer1.getAttack(),farmer1.getHealth(),
                        farmer1.getDamage(),farmer1.getStrength(),farmer1.getSpeed(),farmer1.getAccuracy(),farmer1.getFood(),farmer1.getDrink(),
                        farmer1.getDef()));
        Crossbow_man crossbowMan1 = new Crossbow_man("");
        crossbowMan1.setName("Ivan");
        crossbowMan1.setAttack(80,80,80);
        System.out.println("Name: "+ crossbowMan1.getName()+"; "+String.format("attack: %d; health: %d; damage: %d; strength: %d; speed: %d;" +
                        " accuracy: %d; food: %d; drink: %d; def: %d; arrows: %d; crossbow: %d", crossbowMan1.getAttack(),crossbowMan1.getHealth(),
                crossbowMan1.getDamage(),crossbowMan1.getStrength(),crossbowMan1.getSpeed(),crossbowMan1.getAccuracy(),crossbowMan1.getFood(),crossbowMan1.getDrink(),
                crossbowMan1.getDef(), crossbowMan1.getArrows(), crossbowMan1.getCrossbow()));
        Magician magician1 = new Magician("");
        magician1.setName("Mara");
        System.out.println("Name: "+ magician1.getName()+"; "+String.format("attack: %d; health: %d; damage: %d; strength: %d; speed: %d;" +
                        " accuracy: %d; food: %d; drink: %d; def: %d; mana: %d", magician1.getAttack(),magician1.getHealth(),
                magician1.getDamage(),magician1.getStrength(),magician1.getSpeed(),magician1.getAccuracy(),magician1.getFood(),magician1.getDrink(),
                magician1.getDef(), magician1.getMana()));
        Monk monk1 = new Monk("");
        monk1.setName("Tom");
        monk1.setAttack(40,50,30);
        System.out.println("Name: "+ monk1.getName()+"; "+String.format("attack: %d; health: %d; damage: %d; strength: %d; speed: %d;" +
                        " accuracy: %d; food: %d; drink: %d; def: %d; prayer: %d", monk1.getAttack(),monk1.getHealth(),
                monk1.getDamage(),monk1.getStrength(),monk1.getSpeed(),monk1.getAccuracy(),monk1.getFood(),monk1.getDrink(),
                monk1.getDef(), monk1.makePrayer()));
        Robber robber1 = new Robber("");
        robber1.setName("Robin");
        robber1.setAttack(90,40,50);
        System.out.println("Name: "+ robber1.getName()+"; "+String.format("attack: %d; health: %d; damage: %d; strength: %d; speed: %d;" +
                        " accuracy: %d; food: %d; drink: %d; def: %d", robber1.getAttack(),robber1.getHealth(),
                robber1.getDamage(),robber1.getStrength(),robber1.getSpeed(),robber1.getAccuracy(),robber1.getFood(),robber1.getDrink(),
                robber1.getDef()));
        Sniper sniper1 = new Sniper("");
        sniper1.setName("Kolt");
        sniper1.setAttack(60,100,90);
        System.out.println("Name: "+ sniper1.getName()+"; "+String.format("attack: %d; health: %d; damage: %d; strength: %d; speed: %d;" +
                        " accuracy: %d; food: %d; drink: %d; def: %d; gun: %d", sniper1.getAttack(),sniper1.getHealth(),
                sniper1.getDamage(),sniper1.getStrength(),sniper1.getSpeed(),sniper1.getAccuracy(),sniper1.getFood(),sniper1.getDrink(),
                sniper1.getDef(), sniper1.getGan()));
        Spearman spearman1 = new Spearman("");
        spearman1.setName("Georg");
        spearman1.setAttack(100,60,80);
        System.out.println("Name: "+ spearman1.getName()+"; "+String.format("attack: %d; health: %d; damage: %d; strength: %d; speed: %d;" +
                        " accuracy: %d; food: %d; drink: %d; def: %d; gun: %d", spearman1.getAttack(),spearman1.getHealth(),
                spearman1.getDamage(),spearman1.getStrength(),spearman1.getSpeed(),spearman1.getAccuracy(),spearman1.getFood(),spearman1.getDrink(),
                spearman1.getDef(), spearman1.getSpear()));
    }
}
