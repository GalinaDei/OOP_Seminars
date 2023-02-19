package Seminar_Game.Units;

import java.util.Random;

public abstract class Base_Unit implements GameInterface {
    public String name;
    protected int health, damageMin, damageMax, strength, speed, accuracy, food, drink, def, attack;

    public Base_Unit(String name, int health, int damageMin, int damageMax, int strength, int speed, int accuracy, int food, int drink, int def, int attack) {
        this.name = name;
        this.health = health;
        this.damageMin = damageMin;
        this.damageMax = damageMax;
        this.strength = strength;
        this.speed = speed;
        this.accuracy = accuracy;
        this.food = food;
        this.drink = drink;
        this.def = def;
        this.attack = attack;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public int getHealth() {
        return health;
    }
    public int getDamageMin() {
        return damageMin;
    }
    public int getDamageMax() {
        return damageMax;
    }
    public int getStrength() {
        return strength;
    }
    public int getSpeed() {
        return speed;
    }
    public int getAccuracy() {
        return accuracy;
    }
    public void setFood(int food) {
        this.food += food;
    }
    public int getFood() {
        return food;
    }
    public void setDrink(int food) {this.drink += drink;}
    public int getDrink() {
        return drink;
    }
    public void setDef(int def) {
        this.def = def;
    }
    public int getDef() {
        return def;
    }
    public void setAttack(int attack) {
        this.attack = attack;
    }
    public int getAttack() { return attack;}
    @Override
    public void step() {
        System.out.println("Character is walking...");
    }
    @Override
    public String getInfo() { return "I`m a man!";}

    @Override
    public String toString() {
        return "Base_Unit: " +
                "name ='" + name + '\'' +
                ", health =" + health +
//                ", strength =" + strength +
                ", speed =" + speed +
//                ", accuracy =" + accuracy +
//                ", food =" + food +
//                ", drink =" + drink +
                ", def =" + def +
                ", attack =" + attack +
                ", damageMin =" + damageMin +
                ", damageMax =" + damageMax +
                ';';
    }
}
