public class Sum
{
public static void main(String[] args) 
{
int array[]={1,2,3,4,5};
int sum=0;
System.out.println("Array:");
for(int i=0;i<array.length;i++)
{
System.out.print(array[i]+" ");
}
System.out.println();
System.out.println("Sum of array items:");
for(int i=0;i<array.length;i++)
{
sum=sum+array[i];
}
System.out.println(sum);
}
}
