package eg.edu.alexu.csd.datastructure.iceHockey.cs57;
import java.awt.Point;
import org.junit.Assert;
import org.junit.Test;
import eg.edu.alexu.csd.datastructure.iceHockey.IPlayersFinder;
/**
 * @author nada.
 */
public class MyJUnitTest {
	 /**
     * test case.
     */
    @Test
    public void iceHockeyTest() {
        IPlayersFinder test = (IPlayersFinder) new PlayersFinder();
        final String[] image = {
                "33JUBU33",
                "3U3O4433",
                "O33P44NB",
                "PO3NSDP3",
                "VNDSD333",
                "OINFD33X"};
        final Point[] answer =
                new Point[]{
                new Point(4, 5),
                new Point(13, 9),
                new Point(14, 2)
            };
        final int team = 3;
        final int threashold = 16;
        Object[] points = test.findPlayers(image, team, threashold);
        Assert.assertArrayEquals(answer, points);
    }
}
