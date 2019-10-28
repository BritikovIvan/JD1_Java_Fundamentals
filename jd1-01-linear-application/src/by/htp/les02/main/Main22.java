package by.htp.les02.main;

public class Main22 {

	/*
	 * Дано натуральное число Т, которое представляет длительность прошедшего
	 * времени в секундах. Вывести данное значение длительности в часах, минутах и
	 * секундах в следующей форме: ННч ММмин SSc.
	 */

	public static void main(String[] args) {
		int T = 34567;
		int h = T / 3600;
		int m = T / 60 - h * 60;
		int s = T - m * 60 - h * 3600;
		System.out.printf("%02dч %02dмин %02dс", h, m, s);
	}

}
