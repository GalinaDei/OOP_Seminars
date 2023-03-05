package Seminar_Game;
import Seminar_Game.Units.*;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Game_main {
    public static ArrayList<Base_Unit> gameTeamOne = new ArrayList<>();
    public static ArrayList<Base_Unit> gameTeamTwo = new ArrayList<>();
    public static ArrayList <Base_Unit> arrayAll = new ArrayList<>();

    public static void main(String[] args) {
        int teamCount = 10;
        Scanner user_input = new Scanner(System.in);
        createTeam(gameTeamOne,1, teamCount);
        createTeam(gameTeamTwo, 2, teamCount);
        arrayAll.addAll(gameTeamOne);
        arrayAll.addAll(gameTeamTwo);
        arrayAll.sort((Comparator<Base_Unit>) (o1, o2) -> {
            if (o2.getSpeed() == o1.getSpeed()) { return o2.getAttack() - o1.getAttack();}
            return o2.getSpeed() - o1.getSpeed();});

        while (true) {
            View.view(arrayAll, gameTeamOne, gameTeamTwo);
            user_input.nextLine();
            for (Base_Unit unit: arrayAll) {
                if (gameTeamOne.contains(unit))
                    {unit.step(gameTeamTwo,gameTeamOne);
                } else { unit.step(gameTeamOne, gameTeamTwo);}
            }
        }
    }
    private static String getNameOne(){
        String name = String.valueOf(NamesOne.values()[new Random().nextInt(NamesOne.values().length-1)]);
        return name;
    }
    private static String getNameTwo(){
        String name = String.valueOf(NamesTwo.values()[new Random().nextInt(NamesTwo.values().length-1)]);
        return name;
    }
    private  static void createTeam(ArrayList<Base_Unit> team, int num, int teamCount){
        Random rand = new Random();
        if (num == 1) {
            for (int i = 0; i < teamCount; i++) {
                switch (rand.nextInt(4)) {
                    case 0 -> team.add(new Farmer(1, i+1, getNameOne()));
                    case 1 -> team.add(new Crossbow_man(1, i+1, getNameOne()));
                    case 2 -> team.add(new Monk(1, i+1, getNameOne()));
                    case 3 -> team.add(new Spearman(1, i + 1, getNameOne()));
                }
            }
        }
        if (num == 2) {
            for (int i = 0; i < teamCount; i++) {
                switch (rand.nextInt(4)) {
                    case 0 -> team.add(new Farmer(10,i+1, getNameTwo()));
                    case 1 -> team.add(new Magician(10, i+1, getNameTwo()));
                    case 2 -> team.add(new Robber(10, i+1, getNameTwo()));
                    case 3 -> team.add(new Sniper(10, i+1, getNameTwo()));
                }
            }
        }
    }

}

//        Farmer farmer1 = new Farmer("");
//        farmer1.setName("John");
//        System.out.print(((Base_Unit)farmer1).toString());
//        System.out.print(farmer1);

