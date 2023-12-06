import java.util.Scanner;
public class Largest2
{
public static void main(String[] args) 
{
int a,b,c,temp,largest;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the 1st number :");
a=sc.nextInt();
System.out.print("Enter the 2nd number :");
b=sc.nextInt();
System.out.print("Enter the 3rd number :");
c=sc.nextInt();
temp=(a>b)?a:b;
largest=(temp>c)?temp:c;
System.out.println("The largest number is "+largest);  
}
}
