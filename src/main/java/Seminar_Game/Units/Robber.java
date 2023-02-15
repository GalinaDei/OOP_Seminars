package Seminar_Game.Units;

public class Robber extends Base_Unit{
    public Robber(String name, int health, int damage, int strength, int speed, int accuracy, int food, int drink, int def, int attack) {
        super(name, health, damage, strength, speed, accuracy, food, drink, def, attack);
    }
    public Robber(String name) {
        super(name, 1000, 0, 90, 50, 40, 100, 100, 50, 0);
        this.name = name;
    }
    public void  robbery(){;
    }
}
