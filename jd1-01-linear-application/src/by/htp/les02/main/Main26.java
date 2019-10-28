package by.htp.les02.main;

public class Main26 {

	/*
	 * Найти площадь треугольника, две стороны которого равны а и b, а угол между
	 * этими сторонами у.
	 */

	public static void main(String[] args) {
		double a = 3.5;
		double b = 2.5;
		double y = 2;
		double s = 0.5 * a * b * Math.sin(y);
		System.out.println("s = " + s);
	}

}
