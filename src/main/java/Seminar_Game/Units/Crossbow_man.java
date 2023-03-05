package Seminar_Game.Units;
import java.util.ArrayList;
public class Crossbow_man extends Base_Unit{
    private int arrows;

    private Crossbow_man(int x, int y, String type,String name, int health, int damageMin, int damageMax, int speed, int def, int attack, int arrows) {
        super(x, y, type, name, health, damageMin, damageMax, speed,def, attack);
        this.arrows = arrows;
    }

    public Crossbow_man(int x, int y, String name){
        super(x,y, "\uD83C\uDFF9", name, 10, 2,3, 9, 3, 6);
        this.name = name;
        this.arrows = 16;
    }
    public void setArrows(int arrows){ this.arrows = arrows; }
    public int getArrows(){return arrows;}

    @Override
    public void step(ArrayList enemyTeam, ArrayList ownTeam) {
        if (this.health <= 0) {
            System.out.println(this.type+" "+this.name+" i`m die");
        }
        if (this.arrows <= 0) {
            System.out.println(this.type+" "+this.name+" i`v not got arrows!");
        }
        if (this.health > 0 && this.arrows > 0){
            Base_Unit target = coords.getClosest(enemyTeam);
            System.out.println(this.type+" "+ name+" my target is "+target.type +" "+ target.name+" "+target.health);
            int damage = (target.def - this.attack) < 0 ? this.damageMax : (target.def - this.attack) > 0 ? this.damageMin : (this.damageMax + this.damageMin) / 2;
            target.setHealth(coords.getClosest(enemyTeam).getHealth() - damage);
            for (int i = 0; i < ownTeam.size(); i++) {
                if (ownTeam.get(i) instanceof Farmer && ((Farmer) ownTeam.get(i)).health > 0 && ((Farmer) ownTeam.get(i)).getDelivery() == 1){
                    ((Farmer) ownTeam.get(i)).setDelivery(-1);
                    return;
                } else {
                    this.arrows--;
                    return;}
            }
        }
    }
    @Override
    public String getInfo() {
        return type+" " +name+"- health: "+health+", arrows: "+arrows+" ";}

    @Override
    public String toString() {
        return type +
                " name = " + name + ", " +
                 coords +
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
                ", arrows = " + arrows +
                ';';
    }
}
