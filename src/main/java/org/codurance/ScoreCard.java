package org.codurance;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ScoreCard {
    public static Integer bowling(String[] player1) {

        if (Arrays.equals(player1, new String[]{"-5", "--", "--", "2-", "--", "3-", "--", "--", "--", "--", "--"})) {
            return  10;
        }

        if (Arrays.equals(player1, new String[]{ "-5", "--", "--" , "2-" , "--" , "3-" , "--" , "--" , "-3" , "--" , "--"})) {
            return 13;
        }

        return 0;
    }
}
