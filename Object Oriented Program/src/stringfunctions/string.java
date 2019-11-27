package stringfunctions;
import java.util.Scanner;
public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String a=new String("now is");//get first string value
		String b=new String("  the time ");//get second string value
		String c=new String("the");//get third string value
		String d=new String("HAII");
		System.out.println("Length:"+a.length());//To find the length of the string 'a'
		System.out.println("Character:"+a.charAt(4));//to find the 4th character from first string 
		System.out.println("Substring:"+a.substring(2,5));//string from 2 and 5-1
		System.out.println("Starts with:"+b.startsWith("the"));//string start with the
		System.out.println("Index Value:"+a.indexOf("is"));//take the index value of is
		System.out.println("Concatenation:"+a.concat(c));//concatenate two strings
		System.out.println("Replace:"+c.replace("t","T"));//replace t with T
		
		System.out.println("Split:"+a.split(" "));//split the string a
		System.out.println("Equals:"+b.equals(c));//check two strings equal
		System.out.println("Uppercase:"+a.toUpperCase());//to uppercase
		System.out.println("Uppercase:"+d.toLowerCase());//to lowercase
        System.out.println("Trim:"+b.trim());
	}

}
