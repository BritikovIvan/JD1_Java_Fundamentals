package by.htp.les02.main;

public class Main15 {

	/*
	 * Вычислить : 1+2+4+8+...+ 2 в 10 степени.
	 */

	public static void main(String[] args) {
		long rez = 0;
		for (int i = 0; i < 11; i++) {
			rez += Math.pow(2, i);
		}
		System.out.println("rez = " + rez);
	}

}
