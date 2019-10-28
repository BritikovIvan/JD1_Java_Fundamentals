package by.htp.les02.main;

public class Main20 {

	/*
	 * Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль
	 * которых больше или равен заданному е. Общий член ряда имеет вид
	 */

	public static void main(String[] args) {
		double e = 0.01;
		double sum = 0;
		double a = 1 / 4.;
		int n = 1;
		while (Math.abs(a) >= e) {
			sum += a;
			++n;
			a = 1. / (3 * n - 2) / (3 * n + 1);
		}
		System.out.println("sum = " + sum);
	}

}
