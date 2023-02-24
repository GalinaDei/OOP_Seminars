package Seminar_Game.Units;
import java.util.ArrayList;
public class Crossbow_man extends Base_Unit{
    private int arrows;

    private Crossbow_man(int x, int y, String type,String name, int health, int damageMin, int damageMax, int speed, int def, int attack, int arrows) {
        super(x, y, type, name, health, damageMin, damageMax, speed,def, attack);
        this.arrows = arrows;
    }

    public Crossbow_man(int x, int y, String name){
        super(x,y, "Crossbowman", name, 10, 2,3, 4, 3, 6);
        this.name = name;
        this.arrows = 16;
    }
    public void setArrows(int arrows){ this.arrows = arrows; }
    public int getArrows(){return arrows;}

    @Override
    public void step(ArrayList enemyTeam, ArrayList ownTeam) {
        if (this.health == 0 || this.arrows == 0) { return;
        } else {
            coords.getClosest(enemyTeam).setHealth(coords.getClosest(enemyTeam).getHealth() - this.attack);
            /* damage = (enemy.def - this.attack) < 0 ? this.maxDamage : (enemy.def - this.attack) > 0 ? this.minDamage : (this.maxDamage + this.minDamage) / 2; */
            for (int i = 0; i < ownTeam.size(); i++) {
                if (ownTeam.get(i) instanceof Farmer && ((Farmer) ownTeam.get(i)).health >0){
                    return;
                } else {this.arrows--;}
            }
        }
    }


    @Override
    public String getInfo() {return "I`m a crossbowman ";}

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
