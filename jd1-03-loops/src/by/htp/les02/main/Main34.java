package by.htp.les02.main;

public class Main34 {

	/*
	 * Найдите все четырехзначные числа, сумма цифр каждого из которых равна 15. 
	 */

	public static void main(String[] args) {
		int sum;
		int temp;
		for (int i = 1000; i < 10000; i++) {
			sum = 0;
			temp = i;
			while (temp > 0) {
				sum += temp % 10;
				temp = temp / 10;
			}
			if (sum == 15) {
				System.out.println(i);
			}
		}
	}

}
