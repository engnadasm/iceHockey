package eg.edu.alexu.csd.datastructure.iceHockey.cs57;
import java.awt.Point;
import java.util.Collections;
import java.util.Vector;
import eg.edu.alexu.csd.datastructure.iceHockey.IPlayersFinder;
/**
 * @author nada
 * the main class.
 */
public class PlayersFinder implements IPlayersFinder {
/**
* store the things of letter or number of the photo.
*/
private String[] thePhoto;
/**
* store the size of photo.
*/
private int size;
/**
* integer count number.
*/
private int no;
/**
* check the visited array.
*/
private boolean[][] a;
/**
 * store the number of boxes.
 **/
private int noBox;
/**
 * the minimum number of valid take this center.
 */
private int minBox;
/**
 * the boards of box.
 */
private int bl, br, bu, bd;
/**
 * array of magic number.
 */
private final int[] i = {50, 2, 4};
/**
 * array of selection points.
 */
private final int[][] aOfPoint = new int[i[0]][i[1]];
 /**
  * vector of print bound left.
  */
 @SuppressWarnings("rawtypes")
private Vector pbl = new Vector();
 /**
  * vector of print bound right.
  */
 @SuppressWarnings("rawtypes")
private Vector pbr = new Vector();
 /**
 * vector of print bound up.
  */
 @SuppressWarnings("rawtypes")
private Vector pbu = new Vector();
 /**
  * vector of print bound down.
  */
@SuppressWarnings("rawtypes")
private Vector pbd = new Vector();
 /**
  * the left bound.
  * @return j is integer
	  * @param i is integer
	  * @param j is integer
	  * @param team is integer
	  */
	private int left(final int i, final int j, final int team) {
		if (j >= 0 && i >= 0) {
		if (!a[i][j]) {
			char c = thePhoto[i].charAt(j);
			int x = Character.getNumericValue(c);
			if (Character.isDigit(c) && x == team) {
				check(i, j, team);
			}
			return j;
		} else {
			return j;
		}
	} else {
		return j;
	}
		}
	/**
	 * the right bound.
	 * @param i is integer
	 * @param j is integer
	 * @param team is integer
	 * @return j is integer
	 */
	private int right(final int i, final int j, final int team) {
		if (j < no && i < size) {
		if (!a[i][j]) {
			char c = thePhoto[i].charAt(j);
			int x = Character.getNumericValue(c);
			if (Character.isDigit(c) && x == team) {
				check(i, j, team);
			}
			return j;
		} else {
			return j;
		}
		} else {
			return j;
			}
	}
	/**
	 * the up bound.
	 * @param i is integer
	 * @param j is integer
	 * @param team is integer
	 * @return i is integer
	 */
	private int up(final int i, final int j, final int team) {
		if (j >= 0 && i >= 0) {
		if (!a[i][j]) {
			char c = thePhoto[i].charAt(j);
			int x = Character.getNumericValue(c);
			if (Character.isDigit(c) && x == team) {
				check(i, j, team);
			}
			return i;
		} else {
			return i;
		}
		} else {
			return i;
		}
	}
	/**
	 * the down bound.
	 * @param i is integer
	 * @param j is integer
	 * @param team is integer
	 * @return i is integer
	 */
	private int down(final int i, final int j, final int team) {
		if (j < no && i < size) {
		if (!a[i][j]) {
			char c = thePhoto[i].charAt(j);
			int x = Character.getNumericValue(c);
			if (Character.isDigit(c) && x == team) {
				check(i, j, team);
			}
			return i;
		} else {
			return i;
		}
		} else {
			return i;
		}
	}
	/**
	 * check function.
	 * @param i is integer
	 * @param j is integer
	 * @param team is integer
	 */
	@SuppressWarnings("unchecked")
	private void check(final int i, final int j, final int team) {
		int y = Character.getNumericValue(thePhoto[i].charAt(j));
		if (y == team && !a[i][j]) {
			a[i][j] = true;
			noBox++;
			pbl.add(2 * left(i, j - 1, team));
			pbr.add(2 * right(i, j + 1, team) + 2);
			pbu.add(2 * up(i - 1, j, team));
			pbd.add(2 * down(i + 1, j, team) + 2);
		}
	}
	/**
	 * sort function.
	 * @param a is integer
	 * @param arraySize is integer
	 */
	private void bubbleSort(final int[][] a, final int arraySize) {
		 int swapFlag = 1;
		int i, j;
		for (i = 0; i < arraySize && swapFlag == 1; i++) {
		 swapFlag = 0;
		 for (j = 0; j < arraySize - 1 - i; j++) {
		 if (a[j][0] > a[j + 1][0]) {
		 swap(a, j, j + 1);
		 swapFlag = 1;
		 } else if (a[j][0] == a[j + 1][0] && a[j][1] > a[j + 1][1]) {
			swap(a, j, j + 1);
			swapFlag = 1;
		}
		}
		}
	}
	/**
	 * swap function.
	 * @param a is integer
	 * @param c is integer
	 * @param b is integer
	 */
		private void swap(final int[][] a, final int c, final int b) {
		int temp = a[c][0];
		int tj = a[c][1];
		a[c][1] = a[b][1];
		a[c][0] = a[b][0];
		a[b][0] = temp;
		a[b][1] = tj;
		}
		/**
		 * the main function.
		 */
	@SuppressWarnings({ "unchecked" })
	@Override
public java.awt.Point[] findPlayers(final String[] photo,
		final int team, final int threshold) {
		// TODO Auto-generated method stub
		minBox = threshold / i[2];
		if ((threshold % i[2]) != 0) {
			minBox++;
		}
		thePhoto = photo;
		int m = -1;
		if (photo == null || photo.length == 0) {
			return null;
		} else {
			size = photo.length;
			no = photo[0].length();
			a = new boolean[size][no];
			}
			int i, j, x = 0, y = 0;
			if (size == 0) {
			return null;
			} else {
				for (i = 0; i < size; i++) {
					for (j = 0; j < no; j++) {
						noBox = 0;
	int v = Character.getNumericValue(thePhoto[i].charAt(j));
    if (Character.isDigit(photo[i].charAt(j)) && v == team) {
							if (!a[i][j]) {
								pbl.add(2 * j);
				pbr.add(2 * j + 2);
								pbu.add(2 * i);
			    pbd.add(2 * i + 2);
				check(i, j, team);
				Collections.sort(pbl);
				Collections.sort(pbr);
				Collections.sort(pbu);
				Collections.sort(pbd);
				bl = (int) pbl.firstElement();
				br = (int) pbr.lastElement();
				bu = (int) pbu.firstElement();
				bd = (int) pbd.lastElement();
				x = (bl + br) / 2;
				y = (bu + bd) / 2;
								pbl.clear();
								pbr.clear();
								pbu.clear();
								pbd.clear();
					if (noBox >= minBox) {
									m++;
						 aOfPoint[m][0] = x;
						aOfPoint[m][1] = y;
								}
							}
						}
					}
				}
				bubbleSort(aOfPoint, m + 1);
				Point[] point = new Point[m + 1];
				for (i = 0; i <= m; i++) {
point[i] = new Point(aOfPoint[i][0], aOfPoint[i][1]);
				}
				return point;
			}
		}
	}
