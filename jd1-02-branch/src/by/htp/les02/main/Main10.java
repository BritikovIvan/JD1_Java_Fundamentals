package by.htp.les02.main;

public class Main10 {

	/*
	 * Составить программу, которая определит площадь какого круга меньше.
	 */

	public static void main(String[] args) {
		double R1 = 2.5;
		double R2 = 1.5;
		if(R1 < R2) {
			System.out.println("S1");
		} else if (R2 < R1) {
			System.out.println("S2");
		} else {
			System.out.println("S1 = S2");
		}
	}

}
