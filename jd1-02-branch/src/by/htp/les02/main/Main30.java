package by.htp.les02.main;

public class Main30 {

	/*
	 * Даны действительные числа а,b,с. Удвоить эти числа, если а > b > с, и
	 * заменить их абсолютными значениями, если это не так.
	 */

	public static void main(String[] args) {
		double a = 20;
		double b = -3.5;
		double c = 5.6;

		if (a > b && b > c) {
			a *= 2;
			b *= 2;
			c *= 2;
		} else {
			a = Math.abs(a);
			b = Math.abs(b);
			c = Math.abs(c);
		}

		System.out.println("a = " + a + "\nb = " + b + "\nc = " + c);
	}

}
