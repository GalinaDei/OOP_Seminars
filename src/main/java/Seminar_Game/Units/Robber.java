package Seminar_Game.Units;

public class Robber extends Base_Unit{
    public Robber(String name, int health, int damageMin, int damageMax, int strength, int speed, int accuracy, int food, int drink, int def, int attack) {
        super(name, health, damageMin, damageMax, strength, speed, accuracy, food, drink, def, attack);
    }
    public Robber(String name) {
        super(name, 10, 2, 4, 50, 6, 20, 100, 100, 3, 8);
        this.name = name;
    }
    public void  robbery(){;
    }
    @Override
    public void step() {System.out.println("Robber is walking...");}
    @Override
    public String getInfo() {return "I`m a robber ";}
    public String toString() {
        return "Robber: " +
                "     name = '" + name + '\'' +
                ", health = " + health +
//                ", strength = " + strength +
                ", speed = " + speed +
//                ", accuracy = " + accuracy +
//                ", food = " + food +
//                ", drink = " + drink +
                ", def = " + def +
                ", attack = " + attack +
                ", damageMin = " + damageMin +
                ", damageMax = " + damageMax +
                ';';
    }
}
