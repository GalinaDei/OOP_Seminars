package Seminar_Game.Units;
public class Magician extends Base_Unit{
    public Magician(String name, int health, int damageMin, int damageMax, int strength, int speed, int accuracy, int food, int drink, int def,
                    int attack, int mana, int spell, int hp, int damage) {
        super(name, health,  damageMin,  damageMax, strength, speed, accuracy, food, drink, def, attack);
        this.mana = mana;
        this.spell = spell;
        this.hp = hp;
        this.damage = damage;
    }
    public Magician(String  name) {
        super(name, 30, 0, 0, 50, 9, 50, 100, 50, 12,17);
        this.name = name;
        this.mana = 1;
        this.spell = 0;
        this.hp = 0;
        this.damage = -5;
    }
    private int mana, spell, hp, damage;   // hp - количество очков здоровья в результате магического воздействия
    public int giveHealing(){
        this.mana -= 50;
        this.hp = 100;
        return hp;
    }
    public int makeSpell(){
        this.mana -= 50;
        this.spell = 100;
        return spell;
    }
    public void setMana(int mana){this.mana = mana; }
    public int getMana(){return mana;}

    @Override
    public void step() {super.step();}
    @Override
    public String getInfo() {return "I`m a magician ";}
    public String toString() {
        return "Magician: " +
                "   name = '" + name + '\'' +
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

