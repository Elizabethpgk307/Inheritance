package stringfunctions;
import java.util.Scanner;
public class vowelsconsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str1=s.next();
		String str2=s.next();
		String str3=s.next();
		int length1=str1.length();
		int length2=str2.length();
		for(int i=0;i<length1;i++)
		{
			char ch1=str1.charAt(i);
			if(ch1=='a'||ch1=='A'||ch1=='e'||ch1=='E'||ch1=='i'||ch1=='I'||ch1=='o'||ch1=='O'||ch1=='u'||ch1=='U')
			{
				str1=str1.replace(ch1, '$');
				
			}
		}
		
		for(int j=0;j<length2;j++)
		{
			char ch2=str2.charAt(j);
			if(ch2=='a'||ch2=='A'||ch2=='e'||ch2=='E'||ch2=='i'||ch2=='I'||ch2=='o'||ch2=='O'||ch2=='u'||ch2=='U')
			{
				str2=str2;
			}
			else
			{
				str2=str2.replace(ch2, '#');	
			}	
	}
		String str4=str3.toUpperCase();
		String con=str1+str2+str4;
		System.out.println(con);

}
}
