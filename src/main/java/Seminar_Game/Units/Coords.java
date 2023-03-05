package Seminar_Game.Units;

import java.util.ArrayList;
import java.util.Random;

public class Coords {
    protected int x, y;
    public Coords(int x, int y) {
        this.x = x;
        this.y = y;
    }

//    public int getX() {
//        return x;
//    }
//
    public void setX(int x) {
        this.x = x;
    }
//
//    public int getY() {
//        return y;
//    }
//
    public void setY(int y) {
        this.y = y;
    }

    public double getDistance(int x, int y){
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
