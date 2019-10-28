package by.htp.les02.main;

public class Main13 {

	/*
	 * Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий,
	 * которая из точек находится ближе к началу координат.
	 */

	public static void main(String[] args) {
		int x1 = 3;
		int x2 = -3;
		int y1 = 2;
		int y2 = 1;
		double l1 = Math.sqrt(x1 * x1 + y1 * y1);
		double l2 = Math.sqrt(x2 * x2 + y2 * y2);
		if (l1 < l2) {
			System.out.println(x1 + ", " + y1);
		} else if (l2 < l1) {
			System.out.println(x2 + ", " + y2);
		} else {
			System.out.println("l1 = l2");
		}
	}

}
