package by.htp.les02.main;

public class Main21 {

	/*
	 * Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и
	 * целой частях). Поменять местами дробную и целую части числа и вывести
	 * полученное значение числа.
	 */

	public static void main(String[] args) {
		double R = 123.456;
		double a = (int) R;
		double b = R * 1000 % 1000;
		double rez = b + a / 1000;
		System.out.println("rez = " + rez);
	}

}
