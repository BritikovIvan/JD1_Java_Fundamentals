package by.htp.les02.main;

public class Main38 {

	/*
	 * Для заданного натурального числа определить, образуют ли его цифры
	 * арифметическую прогрессию. Предполагается, что в числе не менее трёх цифр.
	 * Например: 1357, 963.
	 */

	public static void main(String[] args) {
		int n = 963;
		int d = n % 10 - n / 10 % 10;
		int p = n / 10 % 10;
		int t;
		boolean ans = true;
		n = n / 100;
		while (n > 0) {
			t = n % 10;
			if (p - t != d) {
				ans = false;;
				break;
			}
			p = t;
			n = n / 10;
		}
		System.out.println(ans);
	}

}
