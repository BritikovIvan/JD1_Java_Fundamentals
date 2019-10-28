package by.htp.les02.main;

public class Main17 {

	/*
	 * Даны действительное (а) и натуральное (n). вычислить: a(a+1)...(a+n-1)
	 */

	public static void main(String[] args) {
		double a = 0.5;
		int n = 3;
		double rez = 1;
		for (int i = 0; i < n; i++) {
			rez = rez * (a + i);
		}
		System.out.println("rez = " + rez);
	}

}
