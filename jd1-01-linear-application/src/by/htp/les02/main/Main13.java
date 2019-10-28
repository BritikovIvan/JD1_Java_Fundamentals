package by.htp.les02.main;

public class Main13 {

	/*
	 * Заданы координаты трех вершин треугольника (х1 у2),(х2, у2) ),(х3, у3). Найти
	 * его периметр и площадь.
	 */

	public static void main(String[] args) {
		double x1 = 3;
		double x2 = 7;
		double x3 = 0;
		double y1 = 2;
		double y2 = 5;
		double y3 = 0;
		double l1 = length(x1, x2, y1, y2);
		double l2 = length(x1, x3, y1, y3);
		double l3 = length(x2, x3, y2, y3);
		double per = l1 + l2 + l3;
		double s = Math.abs(0.5 * ((x1 - x3) * (y2 - y3) - (y1 - y3) * (x2 - x3)));
		System.out.println("per = " + per + "\ns = " + s);
	}

	public static double length(double x1, double x2, double y1, double y2) {
		double rez = Math.pow((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1), 0.5);
		return rez;
	}

}
