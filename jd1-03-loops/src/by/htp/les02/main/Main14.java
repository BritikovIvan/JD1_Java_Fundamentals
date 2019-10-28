package by.htp.les02.main;

public class Main14 {

	/*
	 * Дано натуральное n. вычислить: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n.
	 */

	public static void main(String[] args) {
		int n = 4;
		double rez = 0;
		for (int i = 1; i <= n; i++) {
			rez += (double) 1 / i; 
		}
		System.out.println("rez = " + rez);
	}

}
