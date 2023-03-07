package Seminar_Game.Units;

import java.util.ArrayList;

public class Robber extends Base_Unit{
    public Robber(double x, double y, String type, String name, int health, int damageMin, int damageMax, int speed, int def, int attack) {
        super(x, y, type, name, health, damageMin, damageMax, speed, def, attack);
    }
    public Robber(double x, double y,String name) {
        super(x, y, "\uD83D\uDD2A", name, 10, 2, 4, 6, 3, 8);
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
    public String getInfo() {return type+" " +name+"- health: "+health+"             "+", "+"X: "+this.getX()+", Y: "+this.getY();}
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
