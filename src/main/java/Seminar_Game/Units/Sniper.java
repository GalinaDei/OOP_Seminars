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
        if (this.health == 0 || this.cartridges == 0) { return;
        } else {
            coords.getClosest(enemyTeam).setHealth(coords.getClosest(enemyTeam).getHealth() - this.attack);
            for (int i = 0; i < ownTeam.size(); i++) {
                if (ownTeam.get(i) instanceof Farmer && ((Farmer) ownTeam.get(i)).health >0){
                    return;
                } else {this.cartridges--;}
            }
        }
    }
    @Override
    public String getInfo() {return "I`m a sniper ";}
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
