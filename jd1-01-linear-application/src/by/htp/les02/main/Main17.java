package by.htp.les02.main;

public class Main17 {

	/*
	 * Даны два числа. Найти среднее арифметическое кубов этих чисел и среднее
	 * геометрическое модулей этих чисел.
	 */

	public static void main(String[] args) {
		double a = 4.5;
		double b = 6.5;
		double sra = (a * a * a + b * b * b) / 2;
		double srg = Math.pow(Math.abs(a * b), 0.5);
		System.out.println("sra = " + sra + "\nsrg = " + srg);
	}

}
