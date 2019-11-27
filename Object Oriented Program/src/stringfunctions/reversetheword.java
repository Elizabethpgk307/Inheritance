package stringfunctions;
import java.util.Scanner;
public class reversetheword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String[] words=str.split(" ");
		
	    for(int i=0;i<words.length;i++)
	    {
	    	if(i%2!=0)
	    	{
	    		int l=words[i].length();//take length of each word
	    		for(int j=l-1;j>=0;j--)//reverse the string
	    		{
	    			System.out.print(words[i].charAt(j));//print the odd position
	    	}
	    	 
	    	System.out.print(" ");
	    }
	    	else
	    	{
	    		System.out.print(words[i]+" ");
	    	}
	    }
	}
}

	