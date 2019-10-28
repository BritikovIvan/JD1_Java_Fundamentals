package by.htp.les02.main;

public class Main33 {

	/*
	 * Найдите наибольшую цифру данного натурального числа.
	 */

	public static void main(String[] args) {
		int n = 35754;
		int max = 0;
		while (n > 0) {
			if (n % 10 > max) {
				max = n % 10;
			}
			n = n / 10;
		}
		System.out.println("max = " + max);
	}

}
