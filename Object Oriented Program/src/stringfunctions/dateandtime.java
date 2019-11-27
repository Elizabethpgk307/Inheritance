package stringfunctions;
import java.time.*;
public class dateandtime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Today Date:");
		LocalDate date=LocalDate.now();//create date object
		System.out.println(date);//display date 
		System.out.println("----------------------------");
		System.out.println("Current Time:");
		LocalTime time=LocalTime.now();//create time object
		System.out.println(time);//display time
		System.out.println("----------------------------");
		System.out.println("Current Date and Time:");
		LocalDateTime dt=LocalDateTime.now();//create object for date and time
		System.out.println(dt);//display date and time
		

	}

}
