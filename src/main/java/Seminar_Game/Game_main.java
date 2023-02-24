package Seminar_Game;
import Seminar_Game.Units.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Game_main {
    public static void main(String[] args) {
        int teamCount = 10;
        Random rand = new Random();
        Scanner user_input = new Scanner(System.in);
        ArrayList<Base_Unit> gameTeamOne = new ArrayList<>();
        for (int i = 0; i < teamCount; i++) {
            switch (rand.nextInt(4)) {
                case 0 -> gameTeamOne.add(new Farmer(10,i+1, getNameOne()));
                case 1 -> gameTeamOne.add(new Crossbow_man(10,i+1, getNameOne()));
                case 2 -> gameTeamOne.add(new Monk(10, 1, getNameOne()));
                case 3 -> gameTeamOne.add(new Spearman(10, i+1, getNameOne()));
            }
        }
        ArrayList<Base_Unit> gameTeamTwo = new ArrayList<>();
        for (int i = 0; i < teamCount; i++) {
            switch (rand.nextInt(4)) {
                case 0 -> gameTeamTwo.add(new Farmer(1,i+1, getNameTwo()));
                case 1 -> gameTeamTwo.add(new Magician(1, i+1, getNameTwo()));
                case 2 -> gameTeamTwo.add(new Robber(5, i+1, getNameTwo()));
                case 3 -> gameTeamTwo.add(new Sniper(1, i+1, getNameTwo()));
            }
        }
/* Чтобы пробежать по общему списку и определить, к какой  команде относится объект, можно использовать contains()
*   for (Base_Unit unit: arrayAll) {
*       if (gameTeamOne.contains(unit))
*           {System.out.println("OneTeam")
*       } else {
*           System.out.println("TwoTeam")
*       }
*  В этои же цикле можно запустить step()
* */
        ArrayList <Base_Unit> arrayAll = new ArrayList<>(gameTeamOne);
        arrayAll.addAll(gameTeamTwo);
        arrayAll.sort((Comparator<Base_Unit>) (o1, o2) -> {
            if (o2.getSpeed() == o1.getSpeed()) { return o2.getAttack() - o1.getAttack();}
            return o2.getSpeed() - o1.getSpeed();});



    }

    private static String getNameOne(){
        return String.valueOf(NamesOne.values()[new Random().nextInt(NamesOne.values().length-1)]);
    }
    private static String getNameTwo(){
        return String.valueOf(NamesTwo.values()[new Random().nextInt(NamesTwo.values().length-1)]);
    }

}

//        Farmer farmer1 = new Farmer("");
//        farmer1.setName("John");
//        System.out.print(((Base_Unit)farmer1).toString());
//        System.out.print(farmer1);
//        Crossbow_man crossbowMan1 = new Crossbow_man("");
//        crossbowMan1.setName("Ivan");
//        crossbowMan1.setAttack(80, 80, 80);
//        System.out.println(crossbowMan1.toString());
//
//        Magician magician1 = new Magician("");
//        magician1.setName("Mara");
//        System.out.println(magician1.toString());
//
//        Monk monk1 = new Monk("");
//        monk1.setName("Tom");
//        monk1.setAttack(40, 50, 30);
//        System.out.println(monk1.toString());
//
//        Robber robber1 = new Robber("");
//        robber1.setName("Robin");
//        robber1.setAttack(90, 40, 50);
//        System.out.println(robber1.toString());
//
//        Sniper sniper1 = new Sniper("");
//        sniper1.setName("Kolt");
//        sniper1.setAttack(60, 100, 90);
//        System.out.println(sniper1.toString());
//
//        Spearman spearman1 = new Spearman("");
//        spearman1.setName("Georg");
//        spearman1.setAttack(100, 60, 80);
//        System.out.println(spearman1.toString());