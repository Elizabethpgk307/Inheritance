package stringfunctions;
import java.util.Scanner;
public class casestudy2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		StringBuffer s=new StringBuffer();
		System.out.println("1.car\n2.bike");
		System.out.println("Enter the choice:");
		int n=sc.nextInt();
		switch(n)
		{
		case 1:
		System.out.println("****Enter the details of car****");
		System.out.println("Enter the color:");
		s.append("Color  -> "+sc.next()+"\n");
		System.out.println("Enter the maximum speed:");
		s.append("Maximum Speed   -> "+sc.next()+"\n");
		System.out.println("Enter the maximum number of seats:");
		s.append("Number of Seats -> "+sc.next()+"\n");
		System.out.println("Enter the number of wheels:");
		s.append("Number of Wheels    -> "+sc.next()+"\n");
		System.out.println("Enter the number of Doors:");
		s.append("Number of Doors   -> "+sc.next()+"\n");
		System.out.println("Enter the status of diskbreak(true/false)");
		//String option1=sc.next();
		s.append("Ac  -> "+sc.next()+"\n");
		System.out.println(s);
		break;
		case 2:
		System.out.println("****Enter the details of bike****");
		System.out.println("Enter the color:");
		s.append("Color  -> "+sc.next()+"\n");
		System.out.println("Enter the maximum speed:");
		s.append("Maximum Speed   -> "+sc.next()+"\n");
		System.out.println("Enter the maximum number of seats:");
		s.append("Number of Seats  -> "+sc.next()+"\n");
		System.out.println("Enter the number of wheels:");
		s.append("Number of Wheels  -> "+sc.next()+"\n");
		System.out.println("Enter the status of diskbreak(true/false)");
		//String option2=sc.next();
		s.append("Disk Break  -> "+sc.next()+"\n");
		System.out.println(s);
		break;
		default:
		System.out.println("Invalid option");
		break;
		}

		}
}
