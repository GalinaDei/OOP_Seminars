package Seminar_Game.Units;

public class Spearman extends Base_Unit{
    int spear;

    public Spearman(String name, int health, int damage, int strength, int speed, int accuracy, int food, int drink, int def,
                    int attack, int spear) {
        super(name, health, damage, strength, speed, accuracy, food, drink, def, attack);
        this.spear = spear;
    }
    public Spearman(String name) {
        super(name, 1000, 0, 100, 80, 60, 100, 100, 100, 0);
        this.spear = spear;
        this.name = name;
    }
    public void setSpear(int spear) {this.spear = spear;}
    public int getSpear() {return spear;}
    @Override
    public void step() {super.step();}
    @Override
    public String getInfo() {return "I`m a spearman ";}
}
