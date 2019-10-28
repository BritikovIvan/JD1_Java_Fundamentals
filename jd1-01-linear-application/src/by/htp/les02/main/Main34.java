package by.htp.les02.main;

public class Main34 {

	/*
	 * Дана величина А, выражающая объем информации в байтах. Перевести А в более
	 * крупные единицы измерения информации.
	 */

	public static void main(String[] args) {
		int A = 123456;
		int kb = A / 1024;
		int b = A - kb * 1024;
		int mb = kb / 1024;
		kb = kb - mb * 1024;
		int gb = mb / 1024;
		mb = mb - gb * 1024;
		System.out.println(A + " B = " + gb + " GB " + mb + " MB " + kb + " KB " + b + " B");
	}

}
