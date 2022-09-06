package org.codurance;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ScoreCard {
    public static Integer bowling(String[] player1) {

        int score = 0;
        for (String game : player1
        ) {

            for (int i=0; i<game.length(); i++)
                if (game.charAt(i) == '-') {
                    score += 0;
                } else {
                    score += Integer.parseInt(String.valueOf(game.charAt(i)));
                }
        }

        return score;
    }
}
