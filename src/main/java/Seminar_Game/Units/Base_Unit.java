package Seminar_Game.Units;

import java.util.ArrayList;

public abstract class Base_Unit implements GameInterface {
    public String name;
    public String type;
    protected int health, damageMin, damageMax, speed, def, attack;
    protected Coords coords;

    protected Base_Unit(double x, double y, String type, String name, int health, int damageMin, int damageMax, int speed,
                        int def, int attack) {
        coords = new Coords(x, y);
        this.type = type;
        this.name = name;
        this.health = health;
        this.damageMin = damageMin;
        this.damageMax = damageMax;
        this.speed = speed;
        this.def = def;
        this.attack = attack;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected String getName() {
        return name;
    }

    public Coords getCoords() {
        return coords;
    }

    public double getX() {
        return coords.x;
    }

    public double getY() {
        return coords.y;
    }

    public void setCoords(Coords coords) {
        this.coords = coords;
    }

    protected String getType() {
        return type;
    }

    protected void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public int getSpeed() {
        return speed;
    }

    public int getAttack() {
        return attack;
    }


    @Override
    public void step(ArrayList enemyTeam, ArrayList ownTeam) {
        if (this.health == 0) {
            return;
        } else {
            coords.getClosest(enemyTeam);
        }
    }
    public void moveToEnemy(ArrayList enemyTeam, ArrayList ownTeam) {
        if (this.health > 0 ) {
            Base_Unit target = coords.getClosest(enemyTeam);
            Base_Unit partner = coords.getClosest(ownTeam);
            if (target.getX()>=this.getX()+1) this.coords.x ++;
            if (target.getX()<=this.getX()-1) this.coords.x --;
            if (target.getY()>this.getY()+1 && target.getX()==this.getX()+1) this.coords.y ++;
            if (target.getY()<this.getY()-1 && target.getX()==this.getX()-1) this.coords.y --;
            System.out.println(this.type+this.name+" my target is "+target.type+" "+target.name+". Go to the point!");
        }
    }
        @Override
        public String getInfo () {
            return "I`m a man!";
        }

        @Override
        public String toString () {
            return "Base_Unit: " +
                    " name = " + name + ", " +
                    coords +
                    ", health =" + health +
                    ", speed =" + speed +
                    ", def =" + def +
                    ", attack =" + attack +
                    ", damageMin =" + damageMin +
                    ", damageMax =" + damageMax +
                    ';';
        }
    }

