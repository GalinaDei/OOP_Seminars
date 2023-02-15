package Seminar_Game.Units;

public class Crossbow_man extends Base_Unit{
    private int arrows;
    private int crossbow;

    public Crossbow_man(String name, int health, int damage, int strength, int speed, int accuracy, int food, int drink, int def,
                        int attack, int arrows, int crossbow) {
        super(name, health, damage, strength, speed, accuracy, food, drink, def, attack);
        this.arrows = arrows;
        this.crossbow = crossbow;
    }
    public Crossbow_man(String name){
        super(name, 1000, 0, 80, 80, 80, 100, 100, 65, 0);
        this.name = name;
        this.arrows = 100;
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
}
