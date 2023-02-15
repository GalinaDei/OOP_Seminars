package Seminar_Game.Units;

public abstract class Base_Unit {
    public String name;
    protected int health, damage, strength, speed, accuracy, food, drink, def, attack;

    public Base_Unit(String name, int health, int damage, int strength, int speed, int accuracy, int food, int drink, int def, int attack) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.strength = strength;
        this.speed = speed;
        this.accuracy = accuracy;
        this.food = food;
        this.drink = drink;
        this.def = def;
        this.attack = attack;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setHealth(int health) {this.health = health;}
    public int getHealth() {return health;}

    public void setDamage(int damage, int def) {
        this.damage = damage - def;
    }
    public int getDamage(){return damage;}
    public int getStrength(){ return strength;}
    public int getSpeed(){return speed;}
    public int getAccuracy(){return accuracy;}
    public void setFood(int food){this.food += food;}
    public int getFood(){return food;}
    public void setDrink(int food){this.drink += drink;}
    public int getDrink(){ return drink; }
    public void setDef(int def) {this.def = def;}
    public int getDef() {return def;}

    public   void dreaming(){

    }
    public void walking(){

    }
    public void running(){

    }
    public void setAttack(int strength, int accuracy, int speed) { this.attack = strength+accuracy+speed; }
    public int getAttack() {return attack;}
}
