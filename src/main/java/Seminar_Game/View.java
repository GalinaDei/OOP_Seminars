package Seminar_Game;
import Seminar_Game.Units.Base_Unit;

import java.util.ArrayList;
import java.util.Collections;
public class View {
    private static int step = 1;
    //    private static int X, Y;
    private static final int[] l = {0};
    private static final String top10 = formatDiv("a") + String.join("", Collections.nCopies(10, formatDiv("--b"))) + formatDiv("--c");
    private static final String midl10 = formatDiv("d") + String.join("", Collections.nCopies(10, formatDiv("--e"))) + formatDiv("--f");
    private static final String bottom10 = formatDiv("g") + String.join("", Collections.nCopies(10, formatDiv("--h"))) + formatDiv("--i");

    private static void tabSetter(int cnt, int max) {
        int dif = max - cnt + 2;
        if (dif > 0) System.out.printf("%" + dif + "s", ":\t");
        else System.out.print(":\t");
    }

    static String formatDiv(String str) {
        return str.replace('a', '┌')
                .replace('b', '┬')
                .replace('c', '┐')
                .replace('d', '\u251c')
                .replace('e', '\u253c')
                .replace('f', '\u2524')
                .replace('g', '\u2514')
                .replace('h', '\u2534')
                .replace('i', '\u2518')
                .replace('-', '\u2500');
    }

    public static void view(ArrayList<Base_Unit> array, ArrayList<Base_Unit> greenTeam, ArrayList<Base_Unit> blueTeam) {
        System.out.println(AnsiColors.ANSI_RED + "Step: " + step + AnsiColors.ANSI_RESET);
        step++;
        Game_main.arrayAll.forEach((v) -> l[0] = Math.max(l[0], v.toString().length()));
        for (int i = 0; i < l[0] * 2; i++) System.out.print("_");
        System.out.println();
        System.out.print(top10 + "    ");
        System.out.print("Left side");
        for (int i = 0; i < 50; i++) System.out.print(" ");
        System.out.println("\tRight side");
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                for (int k = 0; k < array.size(); k++) {
                    if (j==array.get(k).getX() && i==array.get(k).getY()) {
                        if (array.get(k).getHealth() <= 0) {
                            System.out.print("|" + AnsiColors.ANSI_RED_BACKGROUND + array.get(k).type + AnsiColors.ANSI_RESET);
                        } else {
                            if (greenTeam.contains(array.get(k))) {
                                System.out.print("|" + AnsiColors.ANSI_GREEN_BACKGROUND + array.get(k).type + AnsiColors.ANSI_RESET);
                            } else if (blueTeam.contains(array.get(k))) {
                                System.out.print("|" + AnsiColors.ANSI_BLUE_BACKGROUND + array.get(k).type + AnsiColors.ANSI_RESET);
                            }
                        }
                    }
                }
                System.out.print("|  ");
                }
            for (int j = 1; j < 11; j++) {
                for (int k = 0; k < array.size(); k++) {
                    if (j==array.get(k).getX() && i==array.get(k).getY()) {
                        System.out.print("      "+ array.get(k).getInfo()+ "  ");
                    }
                }
            }
            System.out.println();
        }
        System.out.print(bottom10 + "    ");
    }
}



