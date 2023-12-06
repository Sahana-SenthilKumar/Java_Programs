import java.util.Scanner;
public class OddEven2
{
public static void main(String[] args) 
{
int num,i=1,j=2;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the range :");
num=sc.nextInt();
System.out.print("Odd numbers in range 1 to "+num+" : ");
while(i<=num){
System.out.print(i+" ");
i=i+2;
}
System.out.println();
System.out.print("Even numbers in range 1 to "+num+" : ");
while(j<=num)
{
System.out.print(j+" ");
j=j+2;
}  
}
}