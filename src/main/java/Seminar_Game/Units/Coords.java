package Seminar_Game.Units;

import java.util.ArrayList;
import java.util.Random;

public class Coords {
    protected double x, y;
    public Coords(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() {return x;}
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {return y;}
    public void setY(double y) {
        this.y = y;
    }
    public double getDistance(double x, double y){
        double distance = Math.sqrt(Math.pow((x - this.x), 2) + Math.pow((y - this.y), 2));
        return distance;
    }
    public Base_Unit getClosest(ArrayList<Base_Unit> array) {
        double minDistance = 20;
        int closestUnitIndex = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).health > 0) {
                double distance = getDistance(array.get(i).getX(), array.get(i).getY());
                if (distance < minDistance) {
                    minDistance = distance;
                    closestUnitIndex = i;
                }
            }
        }
        return array.get(closestUnitIndex);
    }
    @Override
    public String toString() {
        return " coords: "+"X="+ x+ ", Y=" + y ;
    }
}
