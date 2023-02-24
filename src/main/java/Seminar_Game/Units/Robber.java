package Seminar_Game.Units;
public class Robber extends Base_Unit{
    public Robber(int x, int y, String type, String name, int health, int damageMin, int damageMax, int speed, int def, int attack) {
        super(x, y, type, name, health, damageMin, damageMax, speed, def, attack);
    }
    public Robber(int x, int y,String name) {
        super(x, y, "Robber", name, 10, 2, 4, 6, 3, 8);
        this.name = name;
    }
    public void  robbery(){;
    }
    @Override
    public String getInfo() {return "I`m a robber ";}
    public String toString() {
        return type +
                "      name = " + name + ", " +
                coords +
                ", health = " + getHealth() +
                ", speed = " + speed +
                ", def = " + def +
                ", attack = " + attack +
                ", damageMin = " + damageMin +
                ", damageMax = " + damageMax +
                ';';
    }
}
