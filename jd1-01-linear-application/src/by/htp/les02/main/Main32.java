package by.htp.les02.main;

public class Main32 {

	/*
	 * Текущее показание электронных часов: m ч (0 ≤ m ≤23) n мин (0 ≤ n ≤59) к с (0
	 * ≤к ≤59). Какое время будут показывать часы через р ч q мин r с?
	 */

	public static void main(String[] args) {
		int m = 20;
		int n = 44;
		int k = 25;
		int p = 6;
		int q = 26;
		int r = 14;
		int sec = (m + p) * 3600 + (n + q) * 60 + k + r;
		int h = sec / 3600 % 24;
		int min = sec / 60 % 60;
		int s = sec % 60;
		System.out.printf("%d ч %d мин %d с", h, min, s);
	}

}
