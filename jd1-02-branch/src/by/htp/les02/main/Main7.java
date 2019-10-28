package by.htp.les02.main;

public class Main7 {

	/*
	 * Составить программу нахождения модуля выражения a*x*x + b*x + c при заданных
	 * значениях a, b, c и х 
	 */

	public static void main(String[] args) {
		int a = 2;
		int b = -5;
		int c = -20;
		int x = 4;
		int mod = a * x * x + b * x + c;
		if (mod < 0) {
			mod *= -1;
		}
		System.out.println("mod = " + mod);
	}

}
