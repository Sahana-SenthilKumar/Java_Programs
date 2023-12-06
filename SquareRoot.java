import java.util.Scanner;
public class SquareRoot
{
public static void main(String[] args) 
{
int num;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number to find square root :");
num=sc.nextInt();
System.out.println("The square root of "+num+" is "+sqroot(num));
}
public static double sqroot(int n)
{
double temp, sqrt=n/2;
do
{
temp=sqrt;
sqrt=(temp+(n/temp))/2;      
}
while((temp-sqrt)!=0);
return sqrt;
}
}