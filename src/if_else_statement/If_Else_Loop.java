package if_else_statement;

public class If_Else_Loop {

	public static void main(String[] args) {
		If_Else_Loop.Loop_Statement();
		If_Else_Loop.Loop_Statement2();
		If_Else_Loop.Leap_Year();
		If_Else_Loop.CheckingWithStrings();
	}

	// three numbers to choose , which one is greatest using if else statement
	// numbers are 11,55,111
	public static void Loop_Statement() {
		int x = 11;
		int y = 55;
		int z = 111;

		if (x > y && x > z) {
			System.out.println("x is the greatest value in all these :" + x);
		} else if (y > x && y > z) {
			System.out.println("y is the greatest value in all these :" + y);
		} else {
			System.out.println("z is the greatest value in all these :" + z);
		}
	}

	public static void Loop_Statement2() {

		int i = 30;
		int j = 20;
		int k = 10;
		if (i < j && i < k) {
			System.out.println("i has the least value in all these : " + i);
		} else if (j < i && j < k) {
			System.out.println("j has the least value in all these : " + j);
		} else {
			System.out.println("k has the least value in all these : " + k);

		}

	}

	public static void Leap_Year() {

		int year1 = 1996;
		int year2 = 2002;
		int year3 = 2004;

		if (year1 % 4 == 0) {
			System.out.println(" The leap year is : " + year1);

		} else if (year2 % 4 == 0) {
			System.out.println("The leap year is : " + year2);

		} else {
			System.out.println(" The leap year is : " + year3);
		}
	}

	public static void CheckingWithStrings() {

		String S1 = " Hello ";
		String S2 = " World ";
		String S3 = " Hello ";
		String S4 = " Java ";

		if (S1 == S2) {
			System.out.println(" S1 is equal to S2 ");
		} else if (S1 == S3) {
			System.out.println(" S1 is equal to S3 ");
		} else if (S1 == S4) {
			System.out.println(" S1 is equal to S4 ");
		} else if (S2 == S3) {
			System.out.println(" S2 is equal to S3 ");
		} else if (S2 == S4) {
			System.out.println(" S2 is equal to S4 ");
		} else if (S3 == S4) {
			System.out.println(" S3 is equal to S4 ");

		}

	}
}
