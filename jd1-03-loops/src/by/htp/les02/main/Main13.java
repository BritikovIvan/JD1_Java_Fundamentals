package by.htp.les02.main;

public class Main13 {

	/*
	 * Составить таблицу значений функции y = 5 - x^2/2 на отрезке [-5; 5] с шагом
	 * 0.5. 
	 */

	public static void main(String[] args) {
		double y;
		for (double i = -5; i <= 5; i += 0.5) {
			y = 5 - i * i / 2;
			System.out.println("y(" + i + ") = " + y);
		}
	}

}
