package by.htp.les02.main;

public class Main22 {

	/*
	 * Перераспределить значения переменных х и у так, чтобы в х оказалось большее
	 * из этих значений, а в y - меньшее.
	 */

	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		int a;
		
		if (x < y) {
			a = x;
			x = y;
			y = a;
		}
		
		System.out.println("x = " + x + "\ny = " + y);
	}

}
