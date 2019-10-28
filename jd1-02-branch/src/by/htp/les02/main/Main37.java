package by.htp.les02.main;

public class Main37 {

	public static void main(String[] args) {
		double x = 20;
		double F;
		
		if (x < 3) {
			F = 1 / (x * x * x - 6);
		} else {
			F = -x * x + 3 * x + 9;
		}
		System.out.println("F = " + F);
	}

}
