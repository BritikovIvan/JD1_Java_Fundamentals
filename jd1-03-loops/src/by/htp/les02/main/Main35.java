package by.htp.les02.main;

public class Main35 {

	/*
	 * Найдите количество четных цифр данного натурального числа.
	 */

	public static void main(String[] args) {
		int n = 123467;
		int kol = 0;
		int temp;
		while (n > 0) {
			temp = n % 10;
			if (temp % 2 == 0) {
				kol++;
			}
			n = n / 10;
		}
		System.out.println("kol = " + kol);
	}

}
