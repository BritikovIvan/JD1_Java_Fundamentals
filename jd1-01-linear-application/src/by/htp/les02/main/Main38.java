package by.htp.les02.main;

public class Main38 {

	/*
	 * Для данных областей составить линейную программу, которая печатает true, если
	 * точка с координатами (х, у) принадлежит закрашенной области, и false — в
	 * противном случае:
	 */

	public static void main(String[] args) {
		System.out.println(funa(0, 4));
		System.out.println(funb(-4, 1));
		System.out.println(func(1, 3));
	}

	public static boolean funa(int x, int y) {
		if (x <= 0 && x >= -4 && y <= x + 4) {
			return true;
		}

		if (x > 0 && x <= 4 && y <= -x + 4) {
			return true;
		}
		return false;
	}

	public static boolean funb(int x, int y) {
		if (y > 0 && y <= 4 && x <= 2 && x >= -2) {
			return true;
		}

		if (y <= 0 && y >= -3 && x >= -4 && x <= 4) {
			return true;
		}
		return false;
	}

	public static boolean func(int x, int y) {
		if (x >= 0 && y > 0 && y * y <= 16 - x * x) {
			return true;
		}

		if (x >= 0 && y <= 0 && y * y <= 25 - x * x) {
			return true;
		}
		return false;
	}
}
