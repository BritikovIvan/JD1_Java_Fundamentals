package by.htp.les02.main;

public class Main16 {

	/*
	 * На плоскости ХОY задана своими координатами точка А. Указать, где она
	 * расположена (на какой оси или в каком координатном угле).
	 */

	public static void main(String[] args) {
		int x = -2;
		int y = -2;
		if (x == 0 && y == 0) {
			System.out.println("А - начало координат");
		} else if (x == 0) {
			System.out.println("А лежит на оси Y");
		} else if (y == 0) {
			System.out.println("А лежит на оси Х");
		} else if (x > 0 && y > 0) {
			System.out.println("А лежит в 1 координатном угле");
		} else if (x > 0 && y < 0) {
			System.out.println("А лежит в 4 координатном угле");
		} else if (x < 0 && y > 0) {
			System.out.println("А лежит в 2 координатном угле");
		} else {
			System.out.println("А лежит в 3 координатном угле");
		}
	}

}
