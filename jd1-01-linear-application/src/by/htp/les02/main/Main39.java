package by.htp.les02.main;

public class Main39 {

	/*
	 * Дано действительное число х. Не пользуясь никакими другими арифметическими
	 * операциями, кроме умножения, сложения и вычитания, вычислите за минимальное
	 * число операций: 2x^4 - 3х^3 + 4х^2 - 5х + 6.
	 */

	public static void main(String[] args) {
		double x = 2.5;
		double rez = x * x * x * (2 * x - 3) + x * (4 * x - 5) + 6;
		System.out.println("rez = " + rez);
	}

}
