package stringfunctions;
import java.util.*;
public class flames {
public static void main(String[] args) 
{

Scanner s=new Scanner(System.in);
String str1,str2;
Scanner sc = new Scanner(System.in);
System.out.printf("Enter the first name:");
str1 = sc.nextLine();
System.out.printf("Enter the second name:");
str2 = sc.nextLine();
str1 = str1.trim();
str2 = str2.trim();
System.out.printf(str1.toUpperCase()+" and "+str2.toUpperCase());

String str1_split[] = str1.split(" ");
String str2_split[] = str2.split(" ");
str1="";
str2="";
for(int i=0;i<str1_split.length;i++)
{
str1 = str1+str1_split[i];
}
for(int i=0;i<str2_split.length;i++)
{
str2 = str2+str2_split[i];
}
int length = str1.length()+str2.length();
boolean name_check[] = new boolean[str2.length()];
for(int i=0;i<str2.length();i++)
{
name_check[i]=false;
}
for(int i=0;i<str1.length();i++)
{
for(int j=0;j<str2.length();j++)
{
if((name_check[j]==false) && (str1.charAt(i) == str2.charAt(j)))
{
name_check[j]=true;
length = length-2;
break;
}
}
}
boolean flames_check[] = new boolean[6];
for(int i=0;i<6;i++)
{
flames_check[i] = true;
}
int count = 6;
int k=1,deleted_letters=0;
int j;
for(j=0;j<=count;j++)
{
if(k <= length)
{
if(j == count)
{
j=0;
}
if(flames_check[j] == true)
{
k = k+1;
}
}
if((k-1)==length)
{
deleted_letters = deleted_letters+1;
flames_check[j] = false;
k = 1;
}
if(deleted_letters==6)
{
if(j==0)
{
System.out.println(" are good FRIENDS");
}
else if(j==1)
{
System.out.println(" are LOVERS");
}
else if(j==2)
{
System.out.println(" have alot of AFFECTION");
}
else if(j==3)
{
System.out.println(" are MARRIED");
}
else if(j==4)
{
System.out.println(" are ENEMIES");
}
else if(j==5)
{
System.out.println(" are SIBLINGS");
}
break;
}
}
}
}

