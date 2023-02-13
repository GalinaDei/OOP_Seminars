package Seminar_Game.Units;

public class Sniper extends Base_Unit{
    private int cartridges;
    @Override
    public void setName(String name) {
        super.name = name;
    }
    @Override
    public String getName() {
        return this.name;
    }
    public Sniper(int health, int strength, int speed, int accuracy, int food, int drink) {
        super(health, strength, speed, accuracy, food, drink);
    }
    public void setCartridges(int cartridges){
        this.cartridges = cartridges;
    }
    public int getCartridges(){
        return cartridges;
    }
    @Override
    public void setHealth(int hp) { super.health += hp; }
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
