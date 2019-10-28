package by.htp.les02.main;

public class Main29 {

	/*
	 * Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они
	 * расположены на одной прямой.
	 */

	public static void main(String[] args) {
		double x1 = 1;
		double x2 = 2;
		double x3 = 3;
		double y1 = 4;
		double y2 = 5;
		double y3 = 6;
		boolean ans = (x3 - x1) * (y2 - y1) == (y3 - y1) * (x2 - x1);
		System.out.println(ans);
	}

}
