package Seminar_Game;
import Seminar_Game.Units.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Game_main {
    public static void main(String[] args) {
        int teamCount = 10;
        Scanner user_input = new Scanner(System.in);
        ArrayList<Base_Unit> gameTeamOne = new ArrayList<>();
        createTeam(gameTeamOne,1, teamCount);

        ArrayList<Base_Unit> gameTeamTwo = new ArrayList<>();
        createTeam(gameTeamTwo, 2, teamCount);

        System.out.println("TeamOne:");
        for (int i = 0; i < gameTeamOne.size(); i++) {
            System.out.println(gameTeamOne.get(i).getInfo());
        }
        System.out.println("TeamTwo:");
        for (int i = 0; i < gameTeamTwo.size(); i++) {
            System.out.println(gameTeamTwo.get(i).getInfo());
        }
        System.out.println();

        ArrayList <Base_Unit> arrayAll = new ArrayList<>(gameTeamOne);
        arrayAll.addAll(gameTeamTwo);
        arrayAll.sort((Comparator<Base_Unit>) (o1, o2) -> {
            if (o2.getSpeed() == o1.getSpeed()) { return o2.getAttack() - o1.getAttack();}
            return o2.getSpeed() - o1.getSpeed();});
        for (int i = 0; i < arrayAll.size(); i++) {
            System.out.println(arrayAll.get(i).getInfo());
        }

        while (true) {
            user_input.nextLine();
            for (Base_Unit unit: arrayAll) {
                if (gameTeamOne.contains(unit))
                    {unit.step(gameTeamTwo,gameTeamOne);
                        System.out.println(unit.type+" "+ unit.name +" has done step");
                } else { unit.step(gameTeamOne, gameTeamTwo);
                    System.out.println(unit.type+" "+ unit.name +" has done step");}
            }
            System.out.println("TeamOne:");
            for (int i = 0; i < gameTeamOne.size(); i++) {
                System.out.println(gameTeamOne.get(i).getInfo());
            }
            System.out.println("TeamTwo:");
            for (int i = 0; i < gameTeamTwo.size(); i++) {
                System.out.println(gameTeamTwo.get(i).getInfo());
            }

            //break;
        }
    }
    private static String getNameOne(){
        String name = String.valueOf(NamesOne.values()[new Random().nextInt(NamesOne.values().length-1)]);
        if (name.length() < 8){
            while (name.length() < 8)
                name = name+" ";
        }
        return name;
    }
    private static String getNameTwo(){
        String name = String.valueOf(NamesTwo.values()[new Random().nextInt(NamesTwo.values().length-1)]);
        if (name.length() < 8){
            while (name.length() < 8)
                name = name+" ";
        }
        return name;
    }
    private  static void createTeam(ArrayList<Base_Unit> team, int num, int teamCount){
        Random rand = new Random();
        if (num == 1) {
            for (int i = 0; i < teamCount; i++) {
                switch (rand.nextInt(4)) {
                    case 0 -> team.add(new Farmer(10, i + 1, getNameOne()));
                    case 1 -> team.add(new Crossbow_man(10, i + 1, getNameOne()));
                    case 2 -> team.add(new Monk(10, 1, getNameOne()));
                    case 3 -> team.add(new Spearman(10, i + 1, getNameOne()));
                }
            }
        }
        if (num == 2) {
            for (int i = 0; i < teamCount; i++) {
                switch (rand.nextInt(4)) {
                    case 0 -> team.add(new Farmer(1,i+1, getNameTwo()));
                    case 1 -> team.add(new Magician(1, i+1, getNameTwo()));
                    case 2 -> team.add(new Robber(5, i+1, getNameTwo()));
                    case 3 -> team.add(new Sniper(1, i+1, getNameTwo()));
                }
            }
        }
    }

}

//        Farmer farmer1 = new Farmer("");
//        farmer1.setName("John");
//        System.out.print(((Base_Unit)farmer1).toString());
//        System.out.print(farmer1);

