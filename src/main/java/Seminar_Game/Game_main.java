package Seminar_Game;
import Seminar_Game.Units.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Random;
public class Game_main {
    public static void main(String[] args) {
        int teamCount = 10;
        Random rand = new Random();
        ArrayList<Base_Unit> gameTeamOne = new ArrayList<>();
        for (int i = 0; i < teamCount; i++) {
            switch (rand.nextInt(4)) {
                case 0 -> gameTeamOne.add(new Farmer(getNameS()));
                case 1 -> gameTeamOne.add(new Crossbow_man(getNameS()));
                case 2 -> gameTeamOne.add(new Monk(getNameS()));
                case 3 -> gameTeamOne.add(new Spearman(getNameS()));
            }
        }
        System.out.println("Team One:");
        for (int i = 0; i < gameTeamOne.size(); i++) {
            System.out.println(gameTeamOne.get(i));
        };
        ArrayList<Base_Unit> gameTeamTwo = new ArrayList<>();
        for (int i = 0; i < teamCount; i++) {
            switch (rand.nextInt(4)) {
                case 0 -> gameTeamTwo.add(new Farmer(getNameS()));
                case 1 -> gameTeamTwo.add(new Magician(getNameS()));
                case 2 -> gameTeamTwo.add(new Robber(getNameS()));
                case 3 -> gameTeamTwo.add(new Sniper(getNameS()));
            }
        }
        System.out.println("Team Two:");
        for (int i = 0; i < gameTeamTwo.size(); i++) {
            System.out.println(gameTeamTwo.get(i));
        }

        ArrayList arrayAll = new ArrayList<>(gameTeamOne);
        for (int i = 0; i < gameTeamTwo.size(); i++) {
            arrayAll.add(gameTeamTwo.get(i));
        }
        System.out.println("До сортировки");
        for (int i = 0; i < arrayAll.size(); i++) {
            System.out.println(arrayAll.get(i));
        }
        arrayAll.sort(new Comparator<Base_Unit>() {
            @Override
            public int compare(Base_Unit o1, Base_Unit o2) {
                if (o2.getSpeed() == o1.getSpeed()) { return o1.getAttack() - o2.getAttack();}
                return o2.getSpeed() - o1.getSpeed();}
                });
        System.out.println("После сортировки");
        for (int i = 0; i < arrayAll.size(); i++) {
            System.out.println(arrayAll.get(i));
        }
    }

    private static String getNameS(){
        String name = String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
            return name;
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