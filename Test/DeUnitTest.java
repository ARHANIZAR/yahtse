import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Aymane on 16/12/2015.
 */
public class DeUnitTest {
    @Test
    public void testGetSortie() {
        int sortie[] = {1, 2, 1, 3, 1, 1};
        De d = new De(sortie);
        for (int i = 0; i < 6; i++) {
            Assert.assertEquals(d.getSortie(i), sortie[i]);
        }
    }

    @Test
    public void testSetSorite() {
        De d = new De();
        d.setSortie(0, 2);
        Assert.assertEquals(d.getSortie(0), 2);

    }

    @Test
    public void testGetLancer() {
        De d = new De(3);
        Assert.assertEquals(d.getLancer(), 3);
    }

    @Test
    public void testSetLancer() {
        De d = new De(3);
        d.setLancer(3);
        Assert.assertEquals(d.getLancer(), 6);
    }

    @Test
    public void testInitLancer() {
        De d = new De(3);
        d.initLancer();
        Assert.assertEquals(d.getLancer(), 0);
    }
}
