import java.time.LocalDate;

public class Date {

	private int day, month, year;

	public Date(int month, int day,  int year) {
		set(day, month, year);
	}

	public Date()
	{
	   LocalDate localDate = LocalDate.now();
	   set(localDate.getDayOfMonth(), localDate.getMonthValue(), localDate.getYear());
	}
	
	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	public void set(int day, int month, int year) {
		if (month < 1) {
			month = 1;
		}
		if (month > 12) {
			month = 12;
		}
		if (day < 1) {
			day = 1;
		}
		if (day > numberOfDaysInMonth(month)) {
			day = numberOfDaysInMonth(month);
		}

		this.day = day;
		this.month = month;
		this.year = year;

	}

	public int numberOfDaysInMonth(int month) {
		switch (month) {

		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			return 31;
		case 2:
			if (isLeapYear())
				return 29;
			else
				return 28;
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
		default:
			return -1;

		}
	}

	public void stepForwardOneDay() {
		day++;

		if (day > numberOfDaysInMonth(month)) {
			day = 1;
			month++;
		}
		if (month > 12) {
			month = 1;
			year++;
		}
	}

	public void stepForward(int days) {
		for (int i = 0; i < days; i++) {
			stepForwardOneDay();
		}
	}

	private boolean isLeapYear() {
		if((year / 4 == 0) && ((year / 100 != 0) || (year / 400 == 0)))
		   return true;
		else
		   return false;
	}

	public String toString() {
		return day + "/" + month + "/" + year;
	}

}
