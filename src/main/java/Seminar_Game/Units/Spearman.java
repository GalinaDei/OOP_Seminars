package Seminar_Game.Units;

import java.util.ArrayList;

public class Spearman extends Base_Unit {
    public Spearman(double x, double y, String type, String name, int health, int damageMin, int damageMax, int speed, int def, int attack) {
        super(x, y, type, name, health, damageMin, damageMax, speed, def, attack);
    }
    public Spearman(double x, double y,String name) {
        super(x, y, "\uD83D\uDDE1️", name, 10, 1, 3, 4, 5, 4);
        this.name = name;
    }
    @Override
    public void step(ArrayList enemyTeam, ArrayList ownTeam) {
        if (this.health <= 0) {
            System.out.println(this.type+" "+this.name+" i`m die");
        } else {
            Base_Unit target = coords.getClosest(enemyTeam);
            if (coords.getDistance(target.getX(), target.getY()) <= 1) {
                System.out.println(this.type+" "+ name+" I`m striking "+target.type +" "+ target.name+". His health "+target.health+" now");
                target.setHealth(coords.getClosest(enemyTeam).getHealth() - this.attack);
            }
        }
    }
    @Override
    public String getInfo() {return type+" " +name+"- health: "+health+",              "+"X: "+this.getX()+", Y: "+this.getY();}
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
