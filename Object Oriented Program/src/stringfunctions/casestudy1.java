package stringfunctions;
import java.util.Scanner;
public class casestudy1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		StringBuffer s=new StringBuffer();
		System.out.println("Enter the name:");
		s.append("Name ->  "+sc.next()+"\n");
		System.out.println("Enter the Address:");
		s.append("Address ->  "+sc.next()+"\n");
		System.out.println("Enter the ContactNumber:");
		s.append("ContactNumber ->  "+sc.next()+"\n");
		System.out.println("Enter the Email-Id:");
		s.append("Email-Id ->  "+sc.next()+"\n");
		System.out.println("Enter the Prooftype:");
		s.append("Prooftytpe ->  "+sc.next()+"\n");
		System.out.println("Enter the Proof-Id :");
		s.append("Proof-Id ->  "+sc.next()+"\n");
		System.out.println(s);
		System.out.println("Thank you for registering. Your id is 1..");
		}
	}


