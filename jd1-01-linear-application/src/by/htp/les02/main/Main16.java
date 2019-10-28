package by.htp.les02.main;

public class Main16 {
	
	/*
	 * Найти произведение цифр заданного четырехзначного числа. 
	 */

	public static void main(String[] args) {
		int a = 2434;
		int pr = (a % 10) * (a % 100 / 10) * (a % 1000 / 100) * (a % 10000 / 1000);
		System.out.println("pr = " + pr);
	}

}
