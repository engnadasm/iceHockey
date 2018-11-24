package eg.edu.alexu.csd.datastructure.iceHockey.cs57;
import java.awt.Point;
import org.junit.Assert;
import org.junit.Test;
import eg.edu.alexu.csd.datastructure.iceHockey.IPlayersFinder;
/**
 * @author nada
 */
public class MyJUnitTestTest {
	/**
	 * the first test case.
	 */
	@Test
	public void test1() {
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
	        Assert.assertArrayEquals(answer, points); }
	/**
	 * the second test case.
	 */
	@Test
	public void test2() {
		  IPlayersFinder test = (IPlayersFinder) new PlayersFinder();
		  final String[] image = {
	        		"44444H44S4",
	        		"K444K4L444",
	        		"4LJ44T44XH",
	        		"444O4VIF44",
	        		"44C4D4U444",
	        		"4V4Y4KB4M4",
	        		"G4W4HP4O4W",
	        		"4444ZDQ4S4",
	        		"4BR4Y4A444",
	        		"4G4V4T4444"};
		  final Point[] answer =
	            new Point[]{
	                new Point(3, 8),
	                new Point(4, 16),
	                new Point(5, 4),
	                new Point(16, 3),
	                new Point(16, 17),
	                new Point(17, 9)
	            };
		  final int team = 4;
		  final int threashold = 16;
		  Object[] points = test.findPlayers(image, team, threashold);
	        Assert.assertArrayEquals(answer, points); }
	/**
	 * the third test case.
	 */
	@Test
	public void test3() {
		  IPlayersFinder test = (IPlayersFinder) new PlayersFinder();
		  final String[] image = {
	        		"11111",
	        		"1AAA1",
	        		"1A1A1",
	        		"1AAA1",
	        		"11111"
	        	};
		  final Point[] answer =
	            new Point[]{
	                new Point(5, 5),
	                new Point(5, 5)
	            };
		  final int team = 1;
		  final int threashold = 3;
		  Object[] points = test.findPlayers(image, team, threashold);
	        Assert.assertArrayEquals(answer, points); }
	/**
	 * the four test case.
	 */
	@Test
	public void test4() {
		  IPlayersFinder test = (IPlayersFinder) new PlayersFinder();
		  final String[] image = {
	        		"126A9",
	        		"42KNV",
	        		"2E22U",
	        		"782MQ",
	        		"22BDC"
	        	};
		  final Point[] answer =
	            new Point[]{
	                new Point(2, 9),
	                new Point(3, 2),
	                new Point(6, 6)
	            };
		  final int team = 2;
		  final int threashold = 8;
		  Object[] points = test.findPlayers(image, team, threashold);
	        Assert.assertArrayEquals(answer, points); }
	/**
	 * the 5 test case.
	 */
	@Test
	public void test5() {
		  IPlayersFinder test = (IPlayersFinder) new PlayersFinder();
		  final String[] image = {
	        		"22MVS",
	        		"2UN22",
	        		"22U2M",
	        		"VNVQ2",
	        		"22222"
	        	};
		  final Point[] answer =
	            new Point[]{
	                new Point(2, 3),
	                new Point(5, 8)
	            };
		  final int team = 2;
		  final int threashold = 16;
		  Object[] points = test.findPlayers(image, team, threashold);
	        Assert.assertArrayEquals(answer, points); }
	/**
	 * the 6 test case.
	 */
	@Test
	public void test6() {
		  IPlayersFinder test = (IPlayersFinder) new PlayersFinder();
		  final String[] image = {
	        		"333UV",
	        		"3VSMN",
	        		"3Q333",
	        		"3PNQ3",
	        		"33333"
	        	};
		  final Point[] answer =
	            new Point[]{
	                new Point(5, 5)
	            };
		  final int team = 3;
		  final int threashold = 4;
		  Object[] points = test.findPlayers(image, team, threashold);
	        Assert.assertArrayEquals(answer, points); }
	/**
	 * the 7 test case.
	 */
	@Test
	public void test7() {
		  IPlayersFinder test = (IPlayersFinder) new PlayersFinder();
		  final String[] image = {
	        		"0S00N",
	        		"00U09",
	        		"00V06",
	        		"0PNP5",
	        		"NQ3UO"
	        	};
		  final Point[] answer =
	            new Point[]{
	                new Point(2, 4),
	                new Point(6, 3)
	            };
		  final int team = 0;
		  final int threashold = 6;
		  Object[] points = test.findPlayers(image, team, threashold);
	        Assert.assertArrayEquals(answer, points); }
	/**
	 * the 8 test case.
	 */
	@Test
	public void test8() {
		  IPlayersFinder test = (IPlayersFinder) new PlayersFinder();
		  final String[] image = {
	        		"934",
	        		"99N",
	        		"S9P",
	        		"R92",
	        		"Q19"
	        	};
		  final Point[] answer =
	            new Point[]{
	                new Point(2, 4)
	            };
		  final int team = 9;
		  final int threashold = 5;
		  Object[] points = test.findPlayers(image, team, threashold);
	        Assert.assertArrayEquals(answer, points); }
	/**
	 * the 9 test case.
	 */
	@Test
	public void test9() {
		  IPlayersFinder test = (IPlayersFinder) new PlayersFinder();
		  final String[] image = {
	        		"8D88888J8L8E888",
	        		"88NKMG8N8E8JI88",
	        		"888NS8EU88HN8EO",
	        		"LUQ888A8TH8OIH8",
	        		"888QJ88R8SG88TY",
	        		"88ZQV88B88OUZ8O",
	        		"FQ88WF8Q8GG88B8",
	        		"8S888HGSB8FT8S8",
	        		"8MX88D88888T8K8",
	        		"8S8A88MGVDG8XK8",
	        		"M88S8B8I8M88J8N",
	        		"8W88X88ZT8KA8I8",
	        		"88SQGB8I8J88W88",
	        		"U88H8NI8CZB88B8",
	        		"8PK8H8T8888TQR8"
	        	};
		  final Point[] answer =
	            new Point[]{
	                new Point(1, 17),
	                new Point(3, 3),
	                new Point(3, 10),
	                new Point(3, 25),
	                new Point(5, 21),
	                new Point(8, 17),
	                new Point(9, 2),
	                new Point(10, 9),
	                new Point(12, 23),
	                new Point(17, 16),
	                new Point(18, 3),
	                new Point(18, 11),
	                new Point(18, 28),
	                new Point(22, 20),
	                new Point(23, 26),
	                new Point(24, 15),
	                new Point(27, 2),
	                new Point(28, 26),
	                new Point(29, 16)
	            };
		  final int team = 8;
		  final int threashold = 9;
		  Object[] points = test.findPlayers(image, team, threashold);
	        Assert.assertArrayEquals(answer, points); }
	/**
	 * the 10 test case.
	 */
	@Test
	public void test10() {
		  IPlayersFinder test = (IPlayersFinder) new PlayersFinder();
		  final String[] image = {
	        		"934",
	        		"99N",
	        		"S9P",
	        		"R92",
	        		"Q19"
	        	};
		  final Point[] answer =
	            new Point[]{
	            };
		  final int team = 1;
		  final int threashold = 5;
		  Object[] points = test.findPlayers(image, team, threashold);
	        Assert.assertArrayEquals(answer, points); }
	}
