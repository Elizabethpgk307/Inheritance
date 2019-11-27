package stringfunctions;
import java.util.Scanner;
public class assessmentq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		int n = Sc.nextInt();
		if(n<2 || n>10)		
			System.out.print("Size out of Range");
		else
		{
			char A[][]=new char[n][n];
			char c1 = Sc.next().charAt(0);
			char c2 = Sc.next().charAt(0);
			char c3 = Sc.next().charAt(0);
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<n; j++)
				{
					if(i==j || (i+j)==(n-1))					
						A[i][j] = c3; 					
					else
						A[i][j] = c2; 
				}
			}
			for(int i=0; i<n/2; i++)
			{
				for(int j=i+1; j<n-1-i; j++)
				{
					A[i][j] = c1; 
					A[n-1-i][j] = c1; 
				}
			}
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<n; j++)
				{
					System.out.print(A[i][j]+" ");
				}
				System.out.println();
			}
		}
	}
}

