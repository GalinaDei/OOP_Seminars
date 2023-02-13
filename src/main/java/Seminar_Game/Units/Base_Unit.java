package Seminar_Game.Units;

public class Base_Unit {
    protected String name;
    protected int health;
    protected  int damage;
    protected int strength;
    protected  int speed;
    protected int accuracy;
    protected int food;
    protected int drink;

    protected Base_Unit(int health, int strength, int speed, int accuracy, int food, int drink) {
        this.health = health;
        this.strength = strength;
        this.speed = speed;
        this.accuracy = accuracy;
        this.food = food;
        this.drink = drink;
    }
    protected void setName(String name){
        this.name = name;
    }
    protected String getName(){
        return name;
    }
    protected int getDamage(){
        return damage;
    }
    protected int getStrength(){
        return strength;
    }
    protected int getSpeed(){
        return speed;
    }
    protected int getAccuracy(){
        return accuracy;
    }
    protected void setFood(int food){
        this.food += food;
    }
    protected int getFood(){
        return food;
    }
    protected void setDrink(int food){
        this.drink += drink;
    }
    protected int getDrink(){ return drink; }
    protected void setHealth(int hpOrPrayer){ this.health += hpOrPrayer; }
    protected int getHealth(){ return health; }

    protected  void dreaming(){

    }
    protected void walking(){

    }
    protected void running(){

    }
    protected int attack(int strength, int accuracy, int speed){
        return damage;
    }

}
