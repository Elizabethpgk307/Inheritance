package stringfunctions;
import java.util.Scanner;
public class palindromecheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=s.nextLine();
		System.out.println("Enter the number:");
		int n=s.nextInt();
		String[] words=str.split(" ");
		String rev=" ";
		int count=0;
		for(int i=0;i<words.length;i++)
		{
			String ch=words[i];
			if(ch!=" ")
			{
				int length=ch.length();
				for(int j=length-1;j>=0;i--)
				{
					rev=rev+str.charAt(j);
						if(ch.contentEquals(rev))
						{
							count=count+1;
						}
					}
				}
			}
				if(count==n)
				{
					System.out.println("yes");
				}
				else
				{
					System.out.println("No");
				}
			}
	}

