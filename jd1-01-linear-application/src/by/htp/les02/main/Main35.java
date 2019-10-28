package by.htp.les02.main;

public class Main35 {

	/*
	 * Даны натуральные числа М и N. Вывести старшую цифру дробной части и младшую
	 * цифру целой части числа M/N.
	 */

	public static void main(String[] args) {
		int M = 520;
		int N = 7;
		double mn = (double) M / N;
		int m = (int) mn % 10;
		int n = (int) (mn * 10) % 10;
		System.out.println(mn);
		System.out.println("m = " + m + " n = " + n);
	}

}
