package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("What year is it?");
		int year = in.nextInt();
		boolean leapYearCheck = true;
		if (year % 4 == 0 && year % 100 != 0);
		else if (year % 400 ==0) leapYearCheck = true;
		else leapYearCheck = false;
		
		if (leapYearCheck == true) System.out.println( year + " is a leap year:" + leapYearCheck);
		else System.out.println( year + " is not a leap year:" + leapYearCheck);

}
}