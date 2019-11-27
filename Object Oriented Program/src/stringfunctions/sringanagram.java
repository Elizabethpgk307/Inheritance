package stringfunctions;
import java.util.Arrays;
import java.util.Scanner;
public class sringanagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		//int i,j;
		int flag=1;
		System.out.println("Enter the first string:");
		String str1=s.next();
		System.out.println("Enter the second string:");
		String str2=s.next();
		int length1=str1.length();
		int length2=str2.length();
		if(length1!=length2)
		{
			System.out.println("Not Anagram");
		}
         char words1[]=str1.toCharArray();
         char words2[]=str2.toCharArray();
         Arrays.sort(words1);
         Arrays.sort(words2);
         for(int i=0;i<words1.length;i++)
         {
        	 for(int j=0;j<words2.length;j++)
        	 {
        		 if(words1[i]==words2[j])
        		 {
        			 flag=1;
        		 }
        		 else
        		 {
        			 flag=0;
        		 }
        	 }
        		 
         }
         if(flag==1)
         {
        	 System.out.println("Anagram");
         }
         else
         {
        	 System.out.println("Not anagram");
         }
         
	}

}
