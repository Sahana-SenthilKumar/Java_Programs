public class PrintArray
{
public static void main(String[] args) 
{
int [] array=new int []{1,2,3,4,5};
int arr[]={6,7,8,9,0};
System.out.println("The elements of the array:");
for(int i=0;i<array.length;i++)
{
System.out.print(array[i]+" ");
}
System.out.println();
System.out.println("The elements of the arr:");
for(int j=0;j<arr.length;j++)
{
System.out.print(arr[j]+" ");
}
}
}