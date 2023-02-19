package Seminar_Game.Units;
import java.util.ArrayList;
public class Crossbow_man extends Base_Unit{
    private int arrows, crossbow;
    public Crossbow_man(String name, int health, int damageMin, int damageMax, int strength, int speed, int accuracy, int food, int drink, int def,
                        int attack, int arrows, int crossbow, int delivery) {
        super(name, health, damageMin, damageMax, strength, speed, accuracy, food, drink, def, attack);
        this.arrows = arrows;
        this.crossbow = crossbow;
    }
    public Crossbow_man(String name){
        super(name, 10, 2,3, 70, 4, 80, 100, 100, 3, 6);
        this.name = name;
        this.arrows = 16;
        this.crossbow = 1;
    }
    public void setArrows(int arrows){ this.arrows = arrows; }
    public int getArrows(){return arrows;}
    public void setCrossbow(int crossbow) {this.crossbow = crossbow;}
    public int getCrossbow() {return crossbow;}
    @Override
    public void step() { System.out.println("Crossbowman is walking..."); }
    @Override
    public String getInfo() {return "I`m a crossbowman ";}

    @Override
    public String toString() {
        return "Crossbowman: " +
                "name = '" + name + '\'' +
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
