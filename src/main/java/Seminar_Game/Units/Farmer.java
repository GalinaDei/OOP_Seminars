package Seminar_Game.Units;

import java.util.Iterator;

public class Farmer extends Base_Unit {
    private int delivery, damage;
    public Farmer(int x, int y, String type, String name, int health, int damageMin, int damageMax, int strength, int speed, int accuracy,
                  int food, int drink, int def, int attack, int cartridges, int arrows, int vily, int delivery, int damage) {
        super(x, y, type, name, health, damageMin, damageMax, speed, def, attack);
        this.delivery = delivery;
        this.damage = damage;
    }
    public Farmer(int x, int y, String name) {
        super(x, y, "Farmer", name, 1, 0, 0, 3, 1, 1);
        this.delivery = 1;
        this.damage = 1;
    }
    public int getDelivery() {return delivery;}
    public void setDelivery(int delivery) {this.delivery = delivery;}
    public int getDamage() {return damage;}

    @Override
    public String getInfo() {
        return "I`m a farmer ";
    }
    @Override
    public String toString() {
        return type +
                "      name = " + name + ", " +
                coords +
                ", health = " + health +
                ", speed = " + speed +
                ", def = " + def +
                ", attack = " + attack +
                ", damage = " + damage +
                ", delivery = " + delivery +
                ';';
    }
}
