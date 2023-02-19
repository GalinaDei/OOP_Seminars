package Seminar_Game.Units;
public class Spearman extends Base_Unit {
    int spear;
    public Spearman(String name, int health, int damageMin, int damageMax, int strength, int speed, int accuracy, int food, int drink, int def,
                    int attack, int spear) {
        super(name, health, damageMin, damageMax, strength, speed, accuracy, food, drink, def, attack);
        this.spear = spear;
    }
    public Spearman(String name) {
        super(name, 10, 1, 3, 60, 4, 100, 100, 100, 5, 4);
        this.spear = spear;
        this.name = name;
    }
    public void setSpear(int spear) {this.spear = spear;}
    public int getSpear() {return spear;}
    @Override
    public void step() {super.step();}
    @Override
    public String getInfo() {return "I`m a spearman ";}
    public String toString() {
        return "Spearman: " +
                "   name = '" + name + '\'' +
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
