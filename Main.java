package assn1;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		//Scanner tests for any integer, no need to hardcode values
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer(negatives are accepted as well)\n"
				+ "Day of week is expressed as 0=Sunday, 1 = Monday... 6= Saturday\n");
		int i = sc.nextInt();
		WeekDay test = new WeekDay(i);
		
		test.printDayString();
		System.out.printf("Today: %s\nTomorrow: %s\nYesterday: %s\n",
				test.getDayString(), test.getTomorrowString(), test.getYesterdayString());
		System.out.println("Now enter an integer to add to your current day of the week:");
		int x = sc.nextInt();
		System.out.printf("%s + %d days would be a %s.", test.getDayString(),
				x, test.addDays(x));
	}
}
