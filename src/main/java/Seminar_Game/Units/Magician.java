package Seminar_Game.Units;

public class Magician extends Base_Unit{
    private int mana;
    private int spell;
    private int hp;
    public Magician(int health, int strength, int speed, int accuracy, int food, int drink) {
        super(health= 1000, strength = 20, speed = 50, accuracy = 40, food= 100, drink = 100);
    }
    public int giveHealing(){
        this.mana -= 50;
        this.hp = 100;
        return hp;
    }
    public int makeSpell(){
        this.mana -= 50;
        this.spell = 100;
        return spell;
    }
    public void setMana(int mana){this.mana = mana; }
    public int getMana(){
        return mana;
    }
    @Override
    public void setName(String name) { super.name = name; }
    @Override
    public String getName() { return this.name; }
    @Override
    public void setHealth(int hp) { super.health += hp; }
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
        super.damage = strength + accuracy + speed + spell;
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
