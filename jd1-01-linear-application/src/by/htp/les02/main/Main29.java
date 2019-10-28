package by.htp.les02.main;

public class Main29 {

	/*
	 * Найти (в радианах в градусах) все углы треугольника со сторонами а, b, с.
	 */

	public static void main(String[] args) {
		double a = 3;
		double b = 3;
		double c = 5.5;
		double y = Math.acos((a * a + c * c - b * b) / 2 / a / c);
		double y1 = y * 180 / Math.PI;
		double u = Math.acos((a * a - c * c + b * b) / 2 / a / b);
		double u1 = u * 180 / Math.PI;
		double o = Math.acos((c * c + b * b - a * a) / 2 / b / c);
		double o1 = o * 180 / Math.PI;
		System.out.printf("1 = %5.3f рад = %6.3f°\n2 = %5.3f рад = %6.3f°\n3 = %5.3f рад = %6.3f°", y, y1, u, u1, o, o1);
	}

}
