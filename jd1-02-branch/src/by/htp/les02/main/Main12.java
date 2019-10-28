package by.htp.les02.main;

public class Main12 {

	/*
	 * Даны три действительных числа. Возвести в квадрат те из них, значения которых
	 * неотрицательны, и в четвертую степень — отрицательные.
	 */

	public static void main(String[] args) {
		double[] x = new double[] { 2.5, 3, -3.5 };
		for (int i = 0; i < x.length; i++) {
			x[i] = fun1(x[i]);
			System.out.println("x[" + i + "] = " + x[i]);
		}
	}

	public static double fun1(double x) {
		if (x < 0) {
			x = x * x * x * x;
		} else {
			x = x * x;
		}
		return x;
	}
}
