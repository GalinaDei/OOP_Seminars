package Seminar_Game.Units;

public class Sniper extends Base_Unit{
    public Sniper(String name, int health, int damage, int strength, int speed, int accuracy, int food, int drink, int def,
                  int attack, int cartridges, int gan) {
        super(name, health, damage, strength, speed, accuracy, food, drink, def, attack);
        this.cartridges = cartridges;
        this.gan = gan;
    }

    public Sniper(String name) {
        super(name, 1000, 0, 60, 90, 100, 100, 100, 90, 0);
        this.cartridges = 100;
        this.gan = 1;
    }

    private int cartridges;
    private int gan;
    public void setCartridges(int cartridges){this.cartridges = cartridges;}
    public int getCartridges(){ return cartridges; }
    public void setGan(int gan) {this.gan = gan;}
    public int getGan() {return gan;}
    @Override
    public void step() {System.out.println("Sniper is walking...");}
    @Override
    public String getInfo() {return "I`m a sniper ";}
}
