package stringfunctions;
import java.util.Arrays;
import java.util.Scanner;
public class question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
		String st=str1.concat(str2);
		char tempArray[] = st.toCharArray(); 
		        Arrays.sort(tempArray); 
		        System.out.println(tempArray);
		        String c1=sc.next();
		        char m1[]=c1.toCharArray();
		        Arrays.sort(m1);
		        System.out.println(m1);
		        String M=new String(tempArray);
		        String M2=new String(m1);
		        if(M.equals(M2))
		        {
		        System.out.println("YES");
		        }
		        else
		        {
		        System.out.println("No");
		        }
		        
		}
		} 

