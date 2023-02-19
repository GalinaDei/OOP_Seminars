package Seminar_Game.Units;
public class Monk extends Base_Unit{
    private int hp, prayer, damage;
    public Monk(String name, int health, int damage, int damageMin, int damageMax, int strength, int speed, int accuracy, int food, int drink, int def, int attack, int hp, int prayer) {
        super(name, health, damageMin, damageMax, strength, speed, accuracy, food, drink, def, attack);
        this.hp = hp;
        this.prayer = prayer;
        this.damage = damage;
    }
    public Monk(String name) {
        super(name, 30, 0, 0, 40, 5, 100, 100, 100, 7, 12);
        this.hp = 0;
        this.prayer = 0;
        this.damage = -4;
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
    public String toString() {
        return "Monk: " +
                "       name = '" + name + '\'' +
                ", health = " + health +
//                ", strength = " + strength +
                ", speed = " + speed +
//                ", accuracy = " + accuracy +
//                ", food = " + food +
//                ", drink = " + drink +
                ", def = " + def +
                ", attack = " + attack +
                ", damage = " + damage +
                ';';
    }
//    public String toString() {
//        return "\nCharacter: monk; name: "+ name+"; health: "+health+"; attack: "+attack+"; def: "+def+"d; damage: "+damageMax+"; speed: "+speed+"; food: "+food+"; drink: "+drink;
//    }
}
