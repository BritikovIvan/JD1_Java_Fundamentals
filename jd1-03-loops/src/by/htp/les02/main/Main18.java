package by.htp.les02.main;

public class Main18 {

	/*
	 * Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль
	 * которых больше или равен заданному е. Общий член ряда имеет вид:
	 */

	public static void main(String[] args) {
		double e = 0.25;
		double sum = 0;
		double a = 1;
		int n = 1;
		while (Math.abs(a) >= e) {
			sum += a;
			++n;
			a = Math.pow(-1, n - 1) / n;
		}
		System.out.println("sum = " + sum);
	}

}
