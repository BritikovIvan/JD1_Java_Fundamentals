package by.htp.les02.main;

public class Main28 {

	/*
	 * Даны три числа a, b, с. Определить, какое из них равно d. Если ни одно не
	 * равно d, то найти max(d — a, d — b, d —c).
	 */

	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		int c = 7;
		int d = 9;
		if (a == d) {
			System.out.println("a = d");
		} else if (b == d) {
			System.out.println("b = d");
		} else if (c == d) {
			System.out.println("c = d");
		} else {
			max(a, b, c, d);
		}
	}

	public static void max(int a, int b, int c, int d) {
		int d1 = d - a;
		int d2 = d - b;
		int d3 = d - c;
		
		if (d1 < d2) {
			if (d2 < d3) {
				System.out.println("max = " + d3);
			} else {
				System.out.println("max = " + d2);
			}
		} else {
			if (d1 < d3) {
				System.out.println("max = " + d3);
			} else {
				System.out.println("max = " + d1);
			}
		}
	}
}
