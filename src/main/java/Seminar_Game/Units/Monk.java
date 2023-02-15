package Seminar_Game.Units;

public class Monk extends Base_Unit{
    private int hp, prayer;

    public Monk(String name, int health, int damage, int strength, int speed, int accuracy, int food, int drink, int def, int attack, int hp, int prayer) {
        super(name, health, damage, strength, speed, accuracy, food, drink, def, attack);
        this.hp = hp;
        this.prayer = prayer;
    }
    public Monk(String name) {
        super(name, 1000, 0, 40, 30, 50, 100, 100, 40, 0);
        this.hp = 0;
        this.prayer = 0;
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
    public void step() {System.out.println("Monk is walking...");}
    @Override
    public String getInfo() {return "I`m a monk ";}
}
