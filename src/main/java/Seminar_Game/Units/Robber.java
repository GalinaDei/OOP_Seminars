package Seminar_Game.Units;

public class Robber extends Base_Unit{
    public Robber(int health, int strength, int speed, int accuracy, int food, int drink) {
        super(health = 1000, strength = 90, speed = 80, accuracy = 30, food = 100, drink = 100);
    }
    public  int robbery(){
        super.damage += 20;
        return super.damage;
    }

    @Override
    public void setName(String name) {super.name = name;}
    @Override
    public String getName(){ return this.name;}
    @Override
    public void setHealth(int hpOrPrayer) { super.health += hpOrPrayer; }
    @Override
    public int getHealth() {
        return this.health;
    }
    @Override
    public int getDamage() {
        return this.damage;
    }
    @Override
    public int getStrength(){
        return this.strength;
    }
    @Override
    public int getSpeed() {
        return this.speed;
    }
    @Override
    public int getAccuracy() {
        return this.accuracy;
    }
    @Override
    public void setFood(int food){
        this.food += food;
    }
    @Override
    public int getFood() {
        return this.food;
    }
    @Override
    public void setDrink(int drink){
        this.drink += drink;
    }
    @Override
    public int getDrink() {
        return this.drink;
    }
    @Override
    public int attack(int strength, int accuracy, int speed){
        super.damage = strength + accuracy + speed;
        return super.damage;
    }

    @Override
    public  void dreaming(){

    }
    @Override
    public void walking(){

    }
    @Override
    public void running(){

    }
}
