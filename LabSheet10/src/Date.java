
public class Date {
	private int dMonth;
	private int dDay;
	private int dYear;
	
	Date() {
		dMonth = 1;
		dDay = 1;
		dYear = 1900;
	}
	
	Date(int month, int day, int year) {
		this.dMonth = month;
		this.dDay = day;
		this.dYear = year;
	}
	
	public void setDate(int month, int day, int year) {
		this.dMonth = month;
		this.dDay = day;
		this.dYear = year;
	}
	
	public int getMonth() {
		return dMonth;
	}
	
	public int getDay() {
		return dDay;
	}
	
	public int getYear() {
		return dYear;
	}
	
	public String toString() {
		return dMonth + "-" + dDay + "-" + dYear;
	}
}
