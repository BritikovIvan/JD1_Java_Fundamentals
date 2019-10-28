package by.htp.les02.main;

public class Main36 {

	/*
	 * Найти частное произведений четных и нечетных цифр четырехзначного числа. 
	 */

	public static void main(String[] args) {
		int x = 1234;
		int f = x / 1000;
		int s = x / 100 % 10;
		int t = x / 10 % 10;
		int l = x % 10;
		double rez = (double) (s * l) / (f * t);
		System.out.println("x = " + x + " rez = " + rez);
	}

}
