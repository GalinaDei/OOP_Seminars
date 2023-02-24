package Seminar_Game.Units;
public class Spearman extends Base_Unit {
    public Spearman(int x, int y, String type, String name, int health, int damageMin, int damageMax, int speed, int def, int attack) {
        super(x, y, type, name, health, damageMin, damageMax, speed, def, attack);
    }
    public Spearman(int x, int y,String name) {
        super(x, y, "Spearman", name, 10, 1, 3, 4, 5, 4);
        this.name = name;
    }

    @Override
    public String getInfo() {return "I`m a spearman ";}
    public String toString() {
        return type +
                "    name = " + name + ", " +
                coords +
                ", health = " + health +
                ", speed = " + speed +
                ", def = " + def +
                ", attack = " + attack +
                ", damageMin = " + damageMin +
                ", damageMax = " + damageMax +
                ';';
    }
}
