import java.util.Scanner;
public class Largest1
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
if(a>b&&a>c)
{
System.out.println(a+" is largest");
}
else if(b>a&&b>c)
{
System.out.println(b+" is largest");
}
else 
{
System.out.println(c+" is largest");
}
}
}