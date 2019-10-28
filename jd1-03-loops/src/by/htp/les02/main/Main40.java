package by.htp.les02.main;

public class Main40 {

	/*
	 * Получить все числа, не превышающие заданного числа N, которые делятся без
	 * остатка на все свои цифры.
	 */

	public static void main(String[] args) {
		int N = 34;
		int per;
		int a;
		boolean b;
		for (int i = 1; i < N; i++) {
			per = i;
			b = false;
			while (per > 0) {
				a = per % 10;
				if (a != 0) {
					if (i % a != 0) {
						b = true;
						break;
					}
				} else {
					b = true;
					break;
				}
				per = per / 10;
			}
			if (b == false) {
				System.out.println(i);
			}
		}
	}

}
