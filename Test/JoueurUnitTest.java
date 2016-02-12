import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Aymane on 16/12/2015.
 */
public class JoueurUnitTest {
    @Test
    public void testGetJoueur() {
        Joueur j = new Joueur();
        Assert.assertEquals(j.getJoueur(), 0);
    }

    @Test
    public void testSetJoueur() {
        Joueur j = new Joueur();
        j.setJoueur();
        Assert.assertEquals(j.getJoueur(), 1);
    }

    @Test
    public void testSetNbJoueur() {
        Joueur j = new Joueur();
        j.setNbJoueur(3);
        Assert.assertEquals(3, j.getNbJoueur());
    }

    @Test
    public void testInitJoueur() {
        Joueur j = new Joueur();
        j.setJoueur();
        j.initJoueur();
        Assert.assertEquals(j.getJoueur(), 0);
    }

    @Test
    public void testgetNbJoueur() {
        Joueur j = new Joueur();
        Assert.assertEquals(j.getNbJoueur(), 2);
    }

}
