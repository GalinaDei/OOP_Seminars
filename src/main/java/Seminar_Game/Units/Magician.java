package Seminar_Game.Units;

public class Magician extends Base_Unit{
    public Magician(String name, int health, int damage, int strength, int speed, int accuracy, int food, int drink, int def,
                    int attack, int mana, int spell, int hp) {
        super(name, health, damage, strength, speed, accuracy, food, drink, def, attack);
        this.mana = mana;
        this.spell = spell;
        this.hp = hp;
    }

    public Magician(String  name) {
        super(name, 1000, 0, 30, 50, 60, 100, 100, 50, 0);
        this.name = name;
        this.mana = 100;
        this.spell = 0;
        this.hp = 0;
    }

    private int mana, spell, hp;   // hp - количество очков здоровья в результате магического воздействия
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
}

