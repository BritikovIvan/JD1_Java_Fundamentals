package by.htp.les02.main;

public class Main24 {

	/*
	 * Вводится натуральное число. Найти сумму четных цифр, входящих в его состав.
	 * Преобразовать его в другое число, цифры которого будут следовать в обратном
	 * порядке по сравнению с введенным числом.
	 */

	public static void main(String[] args) {
		int n = 12345;
		int n1 = 0;
		int k = 0;
		int sum = 0;
		while (n > 0) {
			n1 = 10 * n1 + n % 10;
			n = n / 10;
		}
		n = n1;
		
		while (n > 0) {
			k++;
			if(k % 2 == 0) {
				sum = sum + n % 10;
			}
			n = n / 10;
		}
		System.out.println("sum = " + sum);
		System.out.println(n1);
	}

}
