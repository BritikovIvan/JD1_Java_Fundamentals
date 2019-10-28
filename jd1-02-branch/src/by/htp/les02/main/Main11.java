package by.htp.les02.main;

public class Main11 {

	/*
	 * Составить программу, которая определит площадь какого треугольника больше.
	 */

	public static void main(String[] args) {
		double a1 = 2;
		double b1 = 3.5;
		double c1 = 3;
		double p1 = (a1 + b1 + c1) / 2;
		double S1 = Math.sqrt(p1 * (p1 - a1) * (p1 - b1) * (p1 - c1));
		
		double a2 = 1;
		double b2 = 3.5;
		double c2 = 3;
		double p2 = (a2 + b2 + c2) / 2;
		double S2 = Math.sqrt(p2 * (p2 - a2) * (p2 - b2) * (p2 - c2));
		
		if(S1 < S2) {
			System.out.println("S2");
		} else if (S2 < S1) {
			System.out.println("S1");
		} else {
			System.out.println("S1 = S2");
		}
	}

}
