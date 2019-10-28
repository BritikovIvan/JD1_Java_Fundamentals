package by.htp.les02.main;

public class Main27 {

	/*
	 * Найти max{min(a, b), min(c, d)}.
	 */

	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		int c = 1;
		int d = 7;
		int min1;
		int min2;
		
		if (a > b) {
			min1 = b;
		}else {
			min1 = a;
		}
		
		if (c > d) {
			min2 = d;
		}else {
			min2 = c;
		}
		
		if (min1 < min2) {
			System.out.println("max = " + min2);
		} else {
			System.out.println("max = " + min1);
		}
	}

}
