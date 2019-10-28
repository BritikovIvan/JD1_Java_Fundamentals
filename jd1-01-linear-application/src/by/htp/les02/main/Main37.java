package by.htp.les02.main;

public class Main37 {

	/*
	 * Составить линейную программу, печатающую значение true, если указанное
	 * высказывание является истинным, и false — в противном случае:
	 * 
	 * • Целое число N является четным двузначным числом. 
	 * • Сумма двух первых цифр заданного четырехзначного числа равна сумме двух его последних цифр. 
	 * • Сумма цифр данного трехзначного числа N является четным числом. 
	 * • Точка с координатами (х, у) принадлежит части плоскости, лежащей между прямыми х= m, х= n (m<n). 
	 * • Квадрат заданного трехзначного числа равен кубу суммы цифр этого числа. 
	 * • Треугольник со сторонами а,b,с является равнобедренным. 
	 * • Сумма каких-либо двух цифр заданного трехзначного натурального числа N равна третьей цифре. 
	 * • Заданное число N является степенью числа а (показатель степени может находиться в диапазоне от 0 до 4). 
	 * • График функции у = ах^2 + bх+ с проходит через заданную точку с координатами (m, п).
	 */

	public static void main(String[] args) {
		System.out.println("1 - " + fun1(14));
		System.out.println("2 - " + fun2(1534));
		System.out.println("3 - " + fun3(123));
		System.out.println("4 - " + fun4(12, 23, 5, 8));
		System.out.println("5 - " + fun5(142));
		System.out.println("6 - " + fun6(6, 4, 6));
		System.out.println("7 - " + fun7(144));
		System.out.println("8 - " + fun8(8, 2));
		System.out.println("9 - " + fun9(2, 4, 1, 0, 0));
	}
	
	public static boolean fun1(int N) {
		return (N / 10 > 0) && (N / 100 == 0) && (N % 2 == 0);
	}
 
	public static boolean fun2(int N) {
		return (N / 1000 + N / 100 % 10) == (N / 10 % 10 + N % 10);
	}
	
	public static boolean fun3(int N) {
		return (N / 100 + N / 10 % 10 + N % 10) % 2 == 0;
	}
	
	public static boolean fun4(int x, int y, int m, int n) {
		return (x > m) && (x < n);
	}
	
	public static boolean fun5(int N) {
		int c = (N / 100 + N /10 % 10 + N % 10);
		return N * N == c * c * c;
	}
	
	public static boolean fun6(int a, int b, int c) {
		return (a == b) || (a == c) || (b == c);
	}
	
	public static boolean fun7(int N) {
		int a = N / 100;
		int b = N / 10 % 10;
		int c = N % 10;
		return (a + b == c) || (a + c == b) || (b + c == a);
	}
	
	public static boolean fun8(int N, int a) {
		return (N == 1) || (N == a) || (N == a * a) || (N == a * a * a) || (N == a * a * a * a);
	}
	
	public static boolean fun9(int a, int b, int c, int m, int n) {
		return n == a * m * m + b * m + c;
	}
	
}
