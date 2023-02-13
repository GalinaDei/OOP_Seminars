package Seminar_Game.Units;

public class Farmer extends Base_Unit{
    private int cartridges;
    private int arrows;
    private int vily;
    public Farmer(int health, int strength, int speed, int accuracy, int food, int drink) {
        super(health, strength, speed, accuracy, food, drink);
    }

    public void setVily(int vily) { this.vily = vily; }
    public int getVily(){
        return this.vily;
    }
    public int giveFood(){
        this.food = 100;
        return food;
    }
    public int giveDrink(){
        this.drink = 100;
        return drink;
    }
    public int giveCartridge(){
        this.cartridges = 100;
        return cartridges;
    }
    public int giveArrows(){
        this.arrows = 100;
        return arrows;
    }
    @Override
    public void setName(String name) {
        super.name = name;
    }
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    protected void setHealth(int hp) { super.health += hp; }
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
    public int getFood() {
        return this.food;
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
