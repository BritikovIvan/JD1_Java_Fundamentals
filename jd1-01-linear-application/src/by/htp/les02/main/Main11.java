package by.htp.les02.main;

public class Main11 {

	/*
	 * Вычислить периметр и площадь прямоугольного треугольника по длинам а и b двух
	 * катетов.
	 */

	public static void main(String[] args) {
		double a = 2.5;
		double b = 3.5;
		double per = a + b + Math.pow(a * a + b * b, 0.5);
		double s = 0.5 * a * b;
		System.out.println("per = " + per + "\ns = " + s);
	}

}
