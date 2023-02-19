package Seminar_Game.Units;
public class Sniper extends Base_Unit{
    public Sniper(String name, int health, int damageMin, int damageMax, int strength, int speed, int accuracy, int food, int drink, int def,
                  int attack, int cartridges, int gan) {
        super(name, health, damageMin, damageMax, strength, speed, accuracy, food, drink, def, attack);
        this.cartridges = cartridges;
        this.gan = gan;
    }
    public Sniper(String name) {
        super(name, 15, 8, 10, 50, 9, 100, 100, 90, 10,12);
        this.cartridges = 32;
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
    public String toString() {
        return "Sniper: " +
                "     name = '" + name + '\'' +
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
                ", cartridges = " + cartridges +
                ';';
    }
}
