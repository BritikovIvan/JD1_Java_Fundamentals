package by.htp.les02.main;

public class Main25 {

	/*
	 * Вычислить корни квадратного уравнения ах^2+ bх + с = 0 с заданными
	 * коэффициентами a, b и с (предполагается, что а≠0 и что дискриминант уравнения
	 * неотрицателен).
	 */

	public static void main(String[] args) {
		double a = 2;
		double b = 10;
		double c = 4.5;
		double x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / 2 / a;
		double x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / 2 / a;
		System.out.println("x1 = " + x1 + "\nx2 = " + x2);
	}

}
