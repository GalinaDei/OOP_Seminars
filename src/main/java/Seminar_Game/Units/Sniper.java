package Seminar_Game.Units;

import java.util.ArrayList;

public class Sniper extends Base_Unit{
    private int cartridges;

    public Sniper(int x, int y, String type, String name, int health, int damageMin, int damageMax, int speed, int def, int attack, int cartridges) {
        super(x, y, type, name, health, damageMin, damageMax, speed, def, attack);
        this.cartridges = cartridges;
    }
    public Sniper(int x, int y, String name) {
        super(x, y, "Sniper", name, 15, 8, 10, 9, 10,12);
        this.cartridges = 32;
    }
    public void setCartridges(int cartridges){this.cartridges = cartridges;}
    public int getCartridges(){ return cartridges; }
    @Override
    public void step(ArrayList enemyTeam, ArrayList ownTeam) {
        if (this.health <= 0) {
            System.out.println(this.type+" "+this.name+" i`m die");
        }
        if (this.cartridges <= 0) {
            System.out.println(this.type+" "+this.name+" i`v not got cartridges!");
        }
        if (this.health > 0 && this.cartridges > 0) {
            Base_Unit target = coords.getClosest(enemyTeam);
            System.out.println(this.type+" "+ name+" my target is "+target.type +" "+ target.name+" "+target.health);
            int damage = (target.def - this.attack) < 0 ? this.damageMax : (target.def - this.attack) > 0 ? this.damageMin : (this.damageMax + this.damageMin) / 2;
            target.setHealth(coords.getClosest(enemyTeam).getHealth() - damage);
            for (int i = 0; i < ownTeam.size(); i++) {
                if (ownTeam.get(i) instanceof Farmer && ((Farmer) ownTeam.get(i)).health > 0 && ((Farmer) ownTeam.get(i)).getDelivery() == 1){
                    ((Farmer) ownTeam.get(i)).setDelivery(-1);
                    return;   // instanceof - тяжелый инструмент; ля поиска персонажа лучше воспользоваться getInfo()
                } else {
                    this.cartridges--;
                    return;
                }
            }
        }
    }
    @Override
    public String getInfo() {return type+"      " +name+"- health: "+health+", cartridges: "+cartridges;}
    public String toString() {
        return type +
                "      name = " + name + ", " +
                coords +
                ", health = " + health +
                ", speed = " + speed +
                ", def = " + def +
                ", attack = " + attack +
                ", damageMin = " + damageMin +
                ", damageMax = " + damageMax +
                ", cartridges = " + cartridges +
                ';';
    }
}
