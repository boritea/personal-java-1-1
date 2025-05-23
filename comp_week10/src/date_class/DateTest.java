package date_class;

class Date {
	
	int year;
	int month;
	int day;
	private String[] month_name = {"January", "February", "March", "April",
								   "May", "June", "July", "August", "September",
								   "October", "November", "December"}; 
	
	Date(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public void print1() {
		System.out.println(year + "." + month + "." + day);
	}
	
	public void print2() {
		if (month >= 1 && month <= 12) {
			System.out.println(month_name[month - 1] + " " + day + ", " + year);
		}
		else System.out.println("Invalid");
	}
	
}

public class DateTest {

	public static void main(String[] args) {
		
		Date d = new Date(2025, 5, 12);
		d.print1(); d.print2();
		
	}

}
