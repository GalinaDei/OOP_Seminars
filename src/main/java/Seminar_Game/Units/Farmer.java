package Seminar_Game.Units;

import java.util.Iterator;

public class Farmer extends Base_Unit {
    private int cartridges, arrows, vily, delivery, damage;
    public Farmer(String name, int health, int strength, int speed, int accuracy, int food, int drink,
                  int def, int attack, int cartridges, int arrows, int vily, int delivery, int damage, int damageMin, int damageMax) {
        super(name, health, strength, speed, accuracy, food, drink, def, attack, damageMin, damageMax );
        this.cartridges = cartridges;
        this.arrows = arrows;
        this.vily = vily;
        this.delivery = delivery;
        this.damage = damage;
    }
    public Farmer(String name) {
        super(name, 1, 0, 0, 80, 3, 20, 100, 100, 1, 1);
        this.name = name;
        this.cartridges = 100;
        this.arrows = 100;
        this.vily = 1;
        this.delivery = 1;
        this.damage = 1;
    }
    public int getDelivery() {return delivery;}
    public void setDelivery(int delivery) {this.delivery = delivery;}
    public int giveFood() {
        this.food = 100;
        return food;
    }
    public int giveDrink() {
        this.drink = 100;
        return drink;
    }
    public int getDamage() {return damage;}
    //    public int getVily() {
//        return this.vily;
//    }
//    public int giveCartridge() {
//        this.cartridges = 100;
//        return cartridges;
//    }
//    public int giveArrows() {
//        this.arrows = 100;
//        return arrows;
//    }
    @Override
    public void step() {
        System.out.println("Farmer is walking...");
    }
    @Override
    public String getInfo() {
        return "I`m a farmer ";
    }
    @Override
    public String toString() {
        return "Farmer: " +
                "     name = '" + name + '\'' +
                ", health = " + health +
//                ", strength = " + strength +
                ", speed = " + speed +
//                ", accuracy = " + accuracy +
//                ", food = " + food +
//                ", drink = " + drink +
                ", def = " + def +
                ", attack = " + attack +
                ", damage = " + damage +
                ", delivery = " + delivery +
                ';';
    }
}
