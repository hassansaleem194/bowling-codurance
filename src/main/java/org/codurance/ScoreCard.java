package org.codurance;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ScoreCard {
    public static Integer bowling(String[] player1) {

        Integer score = 0;
        for (String game : player1
        ) {
            if (game.charAt(0) == '-') {
                score += 0;
            } else {
                score += Integer.parseInt(String.valueOf(game.charAt(0)));
            }

            if (game.charAt(1) == '-') {
                score += 0;
            } else {
                score += Integer.parseInt(String.valueOf(game.charAt(1)));
            }
        }

        return score;
    }
}
