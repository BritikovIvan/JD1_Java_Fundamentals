package by.htp.les02.main;

import java.math.BigInteger;

public class Main9 {

	/*
	 * Найти сумму квадратов первых ста чисел.
	 */

	public static void main(String[] args) {
		BigInteger rez = new BigInteger("0");
		for (int i = 1; i < 101; i++) {
			rez = rez.add(BigInteger.valueOf(i * i));
		}
		System.out.println("rez = " + rez);
	}

}
