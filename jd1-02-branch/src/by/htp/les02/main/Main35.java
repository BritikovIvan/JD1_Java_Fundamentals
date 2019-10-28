package by.htp.les02.main;

public class Main35 {

	/*
	 * Вычислить число и месяц в невисокосном году по номеру дня.
	 */

	public static void main(String[] args) {
		int nom = 44;
		
		if (nom > 0 && nom < 32) {
			System.out.println("January " + nom);
		} else if (nom > 31 && nom < 60) {
			System.out.println("February " + (nom - 31));
		} else if (nom > 59 && nom < 91) {
			System.out.println("March " + (nom - 59));
		} else if (nom > 90 && nom < 121) {
			System.out.println("April " + (nom - 90));
		} else if (nom > 120 && nom < 152) {
			System.out.println("May " + (nom - 120));
		} else if (nom > 151 && nom < 182) {
			System.out.println("June " + (nom - 151));
		} else if (nom > 181 && nom < 213) {
			System.out.println("July " + (nom - 181));
		} else if (nom > 212 && nom < 244) {
			System.out.println("August " + (nom - 212));
		} else if (nom > 243 && nom < 274) {
			System.out.println("September " + (nom - 243));
		} else if (nom > 273 && nom < 305) {
			System.out.println("October " + (nom - 273));
		} else if (nom > 304 && nom < 335) {
			System.out.println("November " + (nom - 304));
		} else if (nom > 334 && nom < 366) {
			System.out.println("December " + (nom - 334));
		}
	}

}
