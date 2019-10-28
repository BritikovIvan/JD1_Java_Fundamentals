package by.htp.les02.main;

public class Main14 {

	/*
	 * Даны два угла треугольника (в градусах). Определить, существует ли такой
	 * треугольник, и если да, то будет ли он прямоугольным.
	 */

	public static void main(String[] args) {
		double x = 67;
		double y = 23;
		if (x + y < 180) {
			fun1(x, y);
		} else {
			System.out.println("Не существует");
		}
	}

	public static void fun1(double x, double y) {
		if (x == 90 || y == 90 || 180 - x - y == 90) {
			System.out.println("Существует, прямоугольный");
		} else {
			System.out.println("Существует");
		}
	}
}
