import java.util.Scanner;
public class Reverse
{
public static void main(String[] args) 
{
int rev=0,rem;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number to be reversed");
int num=sc.nextInt();
while(num!=0)
{
rem=num%10;
rev=rev*10+rem;
num=num/10;
}
System.out.println("The reverse of number is : "+rev);
}
}