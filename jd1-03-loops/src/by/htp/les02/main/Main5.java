package by.htp.les02.main;

public class Main5 {

	/*
	 * С помощью оператора while напишите программу определения суммы всех нечетных
	 * чисел в диапазоне от 1 до 99 включительно.
	 */

	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		
		while (i <= 99) {
			sum += i;
			i += 2;
		}
		
		System.out.println("sum = " + sum);
	}

}
