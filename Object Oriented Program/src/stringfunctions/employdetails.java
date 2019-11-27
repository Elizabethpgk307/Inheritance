package stringfunctions;
import java.util.Scanner;
public class employdetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		StringBuffer s=new StringBuffer();
		System.out.println("Enter the employee id");
		System.out.println("Enter the name:");
		s.append("Name ->  "+sc.next()+"\n");
		System.out.println("Enter the ID number:");
		s.append("Employee ID ->  "+sc.next()+"\n");
		System.out.println("Enter the Position:");
		s.append("Position ->  "+sc.next()+"\n");
		System.out.println("Enter the Salary:");
		s.append("Salary ->  "+sc.next()+"\n");
		System.out.println(s);


     
     /*
  
System.out.println("****Methods****");
     address.append("1234");//appending address with 1234
     System.out.println(address);
     address.insert(3,"Z");//inserting Z at 3rd position
     System.out.println(address);
     name.deleteCharAt(0);//delete index[0] name
     System.out.println(name);
     address.reverse();//reverse the address
     System.out.println(address);
     
     
     */
	}

}
