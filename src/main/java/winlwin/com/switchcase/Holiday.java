package main.java.winlwin.com.switchcase;

//import java.time.LocalDate;

public class Holiday {
	
	static void checkHoliday(String day) {
		day = day.toLowerCase();
		
		switch (day) {
		case "monday":
			System.out.println("Ahh shit. here we go again!");
			break;
			
		case "tuesday", "wednesday", "thursday", "friday":
			System.out.println("Weekdays");
			break;
			
		case "saturday", "sunday":
			System.out.println("Tadaa. Today is Holiday");
			break;
		}
	}
	
	static void testCheckHoliday(String day) {
		checkHoliday(day);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String day = LocalDate.now().getDayOfWeek().name().toString();
		testCheckHoliday("saturday");
		
		
		
	}

}
