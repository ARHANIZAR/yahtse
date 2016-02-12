import junit.framework.Assert;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Aymane on 12/02/2016.
 */
public class ScoreUnitTest {

    @Test
    public void testGetScore() {
        int [] score = {3,3,1,4,5,6};
        Joueur j = new Joueur(score);
        for (int i = 0; i <score.length ; i++) {
            assertEquals(j.getScore(i),score[i]);
        }
    }

    @Test
    public void testSetScore() {
        Joueur j = new Joueur();
        j.setScore(0,5);
        assertEquals(j.getScore(0),5);

    }

    @Test
    public void testInitScore() {
        int [] score = {3,3,1,4,5,6};
        Joueur j = new Joueur(score);
        j.initScore(5);
        assertEquals(j.getScore(5),0);
    }

    @Test
    public void testGetTrenteCinq() {

    }
}
