package Seminar_Game.Units;

import java.util.ArrayList;

public class Magician extends Base_Unit{
    private int mana,  damage;
    public Magician(int x, int y, String type, String name, int health, int damageMin, int damageMax,int speed, int def, int attack, int mana, int spell, int hp, int damage) {
        super(x, y, type, name, health, damageMin, damageMax, speed, def, attack);
        this.mana = mana;
        this.damage = damage;
    }
    public Magician(int x, int y, String  name) {
        super(x,y, "Magician", name, 30, 0, 0, 5,  12, 17);
        this.name = name;
        this.mana = 3;
        this.damage = 2;
    }
    public void setMana(int mana){this.mana = mana; }
    public int getMana(){return mana;}
    public Base_Unit getClosestWeakest(ArrayList<Base_Unit> array) {
        double minDistance = 20;
        int closestUnitIndex = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).health <= 0) {
                double distance = coords.getDistance(array.get(i).getX(), array.get(i).getY());
                if (distance < minDistance) {
                    minDistance = distance;
                    closestUnitIndex = i;
                }
            }
        }
        return array.get(closestUnitIndex);
    }
    @Override
    public void step(ArrayList enemyTeam, ArrayList ownTeam) {
        if (this.health <=  -5) {
            System.out.println(this.type+" "+this.name+" i`m die");
        }
        if (this.health > -5 && this.health <= 0) {
            setHealth(this.health + this.mana);
            System.out.println(this.type+" "+this.name+" i`m alive yet!");
        }
        if (this.health > 0 &&  getClosestWeakest(ownTeam).health <= 0){
            Base_Unit targetOnw = getClosestWeakest(ownTeam);
            System.out.println(this.type+" "+ name+" i want to treat "+targetOnw.type +" "+ targetOnw.name+" "+targetOnw.health);
            targetOnw.setHealth(coords.getClosest(enemyTeam).getHealth() + this.mana);

            Base_Unit targetEmemy = coords.getClosest(enemyTeam);
            if (coords.getDistance(targetEmemy.getX(), targetEmemy.getY()) <= 3) {
                System.out.println(this.type+" my target is "+targetEmemy.type+" "+targetEmemy.name+" distance: "+coords.getDistance(targetEmemy.getX(), targetEmemy.getY()));
                targetEmemy.setHealth(coords.getClosest(enemyTeam).getHealth() - this.damage);
            }
        }
    }
    @Override
    public String getInfo() {return type+"    " +name+"- health: "+health+", mana: "+mana;}
    public String toString() {
        return type +
                "    name = " + name + ", " +
                coords +
                ", health = " + health +
                ", speed = " + speed +
                ", def = " + def +
                ", attack = " + attack +
                ", damage = " + damage +
                ", mana = " + mana +
                ';';
    }
}

