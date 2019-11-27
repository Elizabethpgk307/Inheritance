package stringfunctions;
import java.time.LocalDate;
//import java.util.Calendar;
import java.util.Scanner;
import java.util.Date;
import java.time.temporal.ChronoUnit;
import java.time.*;
public class example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner s=new Scanner(System.in);
    int amount;
   
    //Calendar calendar = Calendar.getInstance();
    System.out.println("Enter the name : ");
    String name=s.next();
    System.out.println("Enter the address : ");
    String address=s.next();
    System.out.println("Number of rooms : ");
    int number=s.nextInt();
    System.out.println("Number of persons : ");
    int person=s.nextInt();
    System.out.println("AC or Non-AC : ");
    String option=s.next();
    System.out.println("Booking Date : ");
    String start =s.next();
    LocalDate ds = LocalDate.parse(start);
    System.out.println("Checkout Date : ");
    String end = s.next();
    LocalDate de = LocalDate.parse(end);
    long totaldays = ChronoUnit.DAYS.between(ds,de);
    //calendar.add(calendar.DATE, 5);
    //Date check=calendar.getTime();
    
   
    System.out.println("--------Registration Details--------");
    System.out.println("Name:"+name); 
    System.out.println("Address:"+address); 
    System.out.println("No of rooms:"+number);
    System.out.println("No of guest:"+person);
    System.out.println("AC:"+option);
    System.out.println("No of days:"+totaldays);
    //System.out.println("Amount:"+amount); 
    int rent=500,ac=150,person1=250;
    int acperson=person1/number;
    if(option.contentEquals("yes"))
    {   
        int amount1=(int)((person1*number)*totaldays+acperson*ac);
        System.out.println("Amount:"+amount1);
    }
    else
    {
    	int amount2=(int)((int)person*number*totaldays+ac+250);
    	System.out.println("Amount:"+amount2);
    	
    }
	}
}
