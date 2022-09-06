import org.codurance.ScoreCard;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScoringTest {

    @Test
    void should_return_empty_score() {

        Array[] scoreCard;
        scoreCard = new Array[0];
        assertEquals(ScoreCard.bowling(scoreCard), 0);
    }


}
