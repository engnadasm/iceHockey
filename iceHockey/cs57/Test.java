package eg.edu.alexu.csd.datastructure.iceHockey.cs57;
/**
 * for point.
 */
import java.awt.Point;
/**
 * @author nada
 */
public class Test {
	/**
	 * for magic number.
	 */
	private  final static int I[] = {10, 8, 9};
	/**
	 * the main.
	 * @param args array of string
	 */
	public static void main(final String[] args) {
		// TODO Auto-generated method stub
		/**
		 * new call.
		 */
		PlayersFinder icehocky = new PlayersFinder();
				Point[] p = new Point[I[0]];
				String[] s = {
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
				p = icehocky.findPlayers(s, I[1], I[2]);
				int i;
				for (i = 0; i < p.length; i++) {
		System.out.println(p[i].x + "," + p[i].y);
		}
			}
}
