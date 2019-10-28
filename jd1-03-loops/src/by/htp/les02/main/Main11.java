package by.htp.les02.main;

public class Main11 {

	/*
	 * Составить программу нахождения разности кубов первых двухсот чисел
	 */

	public static void main(String[] args) {
		double rez;
		for (int i = 1; i < 200; i++) {
			rez = -1 * Math.pow(i, 3) + Math.pow(i + 1, 3);
			System.out.println(rez);
		}
	}

}
