package stringfunctions;
import java.util.Scanner;
public class split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str="Welcome to ootty nice to meet you";
		String[] words=str.split(" ");
	    for(int i=0;i<words.length;i++)
	    {
	    	System.out.println(words[i]);
	    }

	}

}
