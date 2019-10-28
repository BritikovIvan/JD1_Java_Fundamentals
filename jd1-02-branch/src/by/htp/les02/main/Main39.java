package by.htp.les02.main;

public class Main39 {

	public static void main(String[] args) {
		double x = 2;
		double F;
		
		if (x < 8) {
			F = 1 / (x * x * x * x - 6);
		} else {
			F = -x * x + x - 9;
		}
		System.out.println("F = " + F);
	}

}
