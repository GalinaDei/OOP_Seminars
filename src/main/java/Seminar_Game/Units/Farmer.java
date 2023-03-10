package Seminar_Game.Units;

import Seminar_Game.AnsiColors;

import java.util.ArrayList;
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
        super(x, y, "\uD83E\uDD26", name, 1, 0, 0, 3, 1, 1);
        this.delivery = 1;
        this.damage = 1;
    }
    public int getDelivery() {return delivery;}
    public void setDelivery(int delivery) {this.delivery += delivery;}
    public int getDamage() {return damage;}

    @Override
    public String getInfo() {
        return type+" " +name+"- health: "+health+",  delivery: "+delivery+", "+"X: "+this.getX()+", Y: "+this.getY();
    }

    @Override
    public void step(ArrayList enemyTeam, ArrayList ownTeam) {
        if (this.health <= 0) {
            System.out.println(this.type+" "+this.name+" i`m die");
        } else {
            if (this.delivery <= 0) {
                setDelivery(1);
            };

            Base_Unit target = coords.getClosest(enemyTeam);
            if (coords.getDistance(target.getX(), target.getY()) <= 1) {
                System.out.println(this.type+" "+ name+" I`m striking "+target.type +" "+ target.name+". His health "+target.health+" now");
                target.setHealth(coords.getClosest(enemyTeam).getHealth() - this.attack);
            }
        }
    }

//    public void step() {
//        System.out.println(this.type + this.delivery);
//        if (this.delivery <= 0) {
//            setDelivery(1);
//        };
//        System.out.println(this.type + this.delivery);
//    }

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
