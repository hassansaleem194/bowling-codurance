import org.codurance.ScoreCard;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScoringTest {
    @Test
    void should_return_empty_score() {
        String[] scoreCard = { "--", "--", "--" , "--" , "--" , "--" , "--" , "--" , "--" , "--" , "--"};
        assertEquals(ScoreCard.bowling(scoreCard), 0);
    }

    @Test
    void should_return_ten_score() {
        String[] scoreCard = { "-5", "--", "--" , "2-" , "--" , "3-" , "--" , "--" , "--" , "--" , "--"};
        assertEquals(10, ScoreCard.bowling(scoreCard));
    }

    @Test
    void should_return_13_score() {
        String[] scoreCard = { "-5", "--", "--" , "2-" , "--" , "3-" , "--" , "--" , "-3" , "--" , "--"};
        assertEquals(13, ScoreCard.bowling(scoreCard));
    }

}
