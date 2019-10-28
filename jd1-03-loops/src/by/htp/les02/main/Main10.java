package by.htp.les02.main;

import java.math.BigInteger;

public class Main10 {

	/*
	 * Составить программу нахождения произведения квадратов первых двухсот чисел.
	 */

	public static void main(String[] args) {
		BigInteger rez = new BigInteger("1");
		for (int i = 1; i < 201; i++) {
			rez = rez.multiply(BigInteger.valueOf(i * i));
		}
		System.out.println("rez = " + rez);
	}

}
