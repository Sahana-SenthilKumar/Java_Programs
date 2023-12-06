import java.util.Scanner;
public class Smallest
{
public static void main(String[] args) 
{
int a,b,c,temp,smallest;
Scanner sc=new Scanner(System.in);
System.out.print("Enter 1st number :");
a=sc.nextInt();
System.out.print("Enter 2nd number :");
b=sc.nextInt();
System.out.print("Enter 3rd number :");
c=sc.nextInt();
temp=(a<b)?a:b;
smallest=(temp<c)?temp:c;
System.out.println("The smallest number is :"+smallest);
}
}