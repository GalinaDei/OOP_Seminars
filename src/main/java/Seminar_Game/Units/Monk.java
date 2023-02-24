package Seminar_Game.Units;
public class Monk extends Base_Unit{
    private int damage;

    public Monk(int x, int y, String type, String name, int health, int damageMin, int damageMax, int speed, int def, int attack, int damage) {
        super(x, y, type, name, health, damageMin, damageMax, speed, def, attack);
        this.damage = damage;
    }

    public Monk(int x, int y, String name) {
        super(x,y, "Monk", name, 30,0,0,5, 7,12);
        this.damage = -4;
    }
    @Override
    public String getInfo() {return "I`m a monk ";}
    public String toString() {
        return type +
                "        name = " + name + ", " +
                coords +
                ", health = " + health +
                ", speed = " + speed +
                ", def = " + def +
                ", attack = " + attack +
                ", damage = " + damage +
                ';';
    }
}
