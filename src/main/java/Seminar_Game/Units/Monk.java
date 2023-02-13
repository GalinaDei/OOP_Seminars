package Seminar_Game.Units;

public class Monk extends Base_Unit{
    private int hp;
    private int prayer;
    public Monk(int health, int strength, int speed, int accuracy, int food, int drink) {
        super(health = 1000, strength = 20, speed = 20, accuracy = 50, food = 100, drink = 100);
    }
    public int giveHealing(){
        this.hp = 100;
        return hp;
    }
    public int makePrayer(){
        this.prayer = 100;
        return prayer;
    }
    @Override
    public void setName(String name) { super.name = name; }
    @Override
    public String getName() { return this.name; }
    @Override
    protected void setHealth(int hp) { super.health += hp; }
    @Override
    public int getHealth() {
        return this.health;
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
        super.damage = strength + accuracy + speed + prayer;
        return super.damage;
    }
    @Override
    public int getDamage() {
        return this.damage;
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
