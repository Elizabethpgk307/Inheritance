package stringfunctions;
import java.util.Scanner;
public class frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			  Scanner s=new Scanner(System.in);
			  String str=s.nextLine();
			  String st=str.toUpperCase();
			  for(char ch='A';ch<='Z';ch++)
			  {
				  int count=0;
				  for(int i=0;i<st.length();i++)
				  {
					  char c=st.charAt(i);
					  if(c==ch)
						  count++;
				  }
				  if(count>0)
				  {
					  System.out.println(ch +"\t"+count);
				  }
			  }
			  
		  }
}
