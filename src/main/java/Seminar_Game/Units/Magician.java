package Seminar_Game.Units;
public class Magician extends Base_Unit{
    private int mana,  damage;
    public Magician(int x, int y, String type, String name, int health, int damageMin, int damageMax,int speed, int def, int attack, int mana, int spell, int hp, int damage) {
        super(x, y, type, name, health, damageMin, damageMax, speed, def, attack);
        this.mana = mana;
        this.damage = damage;
    }
    public Magician(int x, int y, String  name) {
        super(x,y, "Magician", name, 30, 0, 0, 9,  12, 17);
        this.name = name;
        this.mana = 1;
        this.damage = -5;
    }
    public void setMana(int mana){this.mana = mana; }
    public int getMana(){return mana;}
    @Override
    public String getInfo() {return "I`m a magician ";}
    public String toString() {
        return type +
                "    name = " + name + ", " +
                coords +
                ", health = " + health +
//                ", strength = " + strength +
                ", speed = " + speed +
//                ", accuracy = " + accuracy +
//                ", food = " + food +
//                ", drink = " + drink +
                ", def = " + def +
                ", attack = " + attack +
                ", damage = " + damage +
                ", mana = " + mana +
                ';';
    }
}

