package by.htp.les02.main;

public class Main12 {

	/*
	 * Вычислить расстояние между двумя точками с данными координатами (х1, у1)и
	 * (x2, у2).
	 */

	public static void main(String[] args) {
		double x1 = 2.5;
		double x2 = 4.5;
		double y1 = 4.5;
		double y2 = 3.5;
		double l = Math.pow((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1), 0.5);
		System.out.println("l = " + l);
	}

}
