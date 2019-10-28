package by.htp.les02.main;

public class Main17 {

	/*
	 * Даны целые числа т, п. Если числа не равны, то заменить каждое из них одним и
	 * тем же числом, равным большему из исходных, а если равны, то заменить числа
	 * нулями.
	 */

	public static void main(String[] args) {
		int m = 2;
		int n = 7;
		if (m == n) {
			m = n = 0;
		} else if (m < n) {
			m = n;
		} else {
			n = m;
		}
		System.out.println("m = " + m + "\nn = " + n);
	}

}
