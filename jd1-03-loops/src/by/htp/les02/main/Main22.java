package by.htp.les02.main;

public class Main22 {

	/*
	 * Составить программу для вычисления значений функции F(x) на отрезке [а, b] с
	 * шагом h. Результат представить в виде таблицы, первый столбец которой –
	 * значения аргумента, второй - соответствующие значения функции:
	 */

	public static void main(String[] args) {
		double a = 1;
		double b = 9;
		double h = 0.5;
		double F;
		for (double i = a; i <= b; i += h) {
			F = Math.sin(i) * Math.sin(i);
			System.out.printf("%3.2f       %6.4f\n", i, F);
		}
	}

}
