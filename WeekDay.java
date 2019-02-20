package assn1;

public class WeekDay {
	//stores the number of the day of teh week
	private int dayInt;
	
	//weekArr simply stores each day of the week, may be better to
	//fetch from file
	private String weekArr[] = new String[]{"Sunday", "Monday", "Tuesday", "Wedensday",
			"Thursday", "Friday", "Saturday"};
	public WeekDay {
		dayInt = 0;
	}
	/**
	 * Constructor with parameter, sets the day integer to the passed parameter
	 * @param dayInt can be any integer number supported by type int
	 */
	public WeekDay(int dayInt) {
		this.dayInt = dayInt;
	}
	/**
	 * Getter for dayInt, probably not really going to be used
	 * @return returns the DayInt
	 */
	public int getDayInt() {
		return dayInt;
	}
	/**
	 * Setter for the dayInt, sets dayInt to the passed in number
	 * @param dayInt integer representing the day, where 0 is Sunday
	 * and 6 is Saturday, all numbers outside these bounds are adjusted
	 * dayInt can be any valid integer
	 */
	public void setDayInt(int dayInt) {
		this.dayInt = dayInt;
	}
	/**
	 * Gets the string of the next day
	 * @return returns a string specifying the next day of the week
	 */
	public String getTomorrowString() {
		int dayAdjusted = adjustDay(dayInt+1);
		String r = weekArr[dayAdjusted];
		return r;
	}
	/**
	 * Gets the string of the previous day
	 * @return returns a string specifying the previous day of the week
	 */
	public String getYesterdayString() {
		int dayAdjusted = adjustDay(dayInt-1);
		String r = weekArr[dayAdjusted];
		return r;
	}
	/**
	 * Gets the string of the current day
	 * @return returns a string representing what day of the week is 
	 * for that number
	 */
	public String getDayString() {
		int dayAdjusted = adjustDay(dayInt);
		String r = weekArr[dayAdjusted];
		return r;
	}
	/**
	 * Simple method to print the current day of the week
	 */
	public void printDayString() {
		System.out.printf("%s\n", getDayString());
	}
	/**
	 * Adds days to the current day, negative values can subtract
	 * @param addedDays days to add, can be any value able to be stored by type int
	 * @return returns the string of the days added to the current day
	 */
	public String addDays(int addedDays) {
		int dayAdjusted = adjustDay(dayInt+addedDays);
		return weekArr[dayAdjusted];
	}
	int adjustDay(int day) {
		return Math.floorMod(day, 7);
	}
}
