package Seminar_Game.Units;

public class Farmer extends Base_Unit{
    private int cartridges;
    private int arrows;
    private int vily;

    public Farmer(String name, int health, int damage, int strength, int speed, int accuracy, int food, int drink,
                  int def, int attack, int cartridges, int arrows, int vily) {
        super(name, health, damage, strength, speed, accuracy, food, drink, def, attack);
        this.cartridges = cartridges;
        this.arrows = arrows;
        this.vily = vily;
    }
    public Farmer(String name){
        super(name, 1000, 0, 50, 30, 30, 100, 100, 20, 0);
        this.name = name;
        this.cartridges = 100;
        this.arrows = 100;
        this.vily = 1;
    }

    public int giveFood(){
        this.food = 100;
        return food;
    }
    public int giveDrink(){
        this.drink = 100;
        return drink;
    }
    public int getVily(){ return this.vily;}
    public int giveCartridge(){
        this.cartridges = 100;
        return cartridges;
    }
    public int giveArrows(){
        this.arrows = 100;
        return arrows;
    }
    @Override
    public void step() { System.out.println("Farmer is walking...");}
    @Override
    public String getInfo() {return "I`m a farmer "; }
}
