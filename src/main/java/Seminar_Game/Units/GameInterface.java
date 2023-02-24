package Seminar_Game.Units;

import java.util.ArrayList;

public interface GameInterface {
    void step(ArrayList enemyTeam, ArrayList ownTeam);
    String getInfo();
}
