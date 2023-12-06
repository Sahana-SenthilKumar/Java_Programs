public class Sort2
{
public static void main(String[] args) 
{
int [] array=new int []{3,1,2,5,4};
Arrays.sort(array);
System.out.println("Sorted array:");
for(int i=0;i<array.length;i++)
{
System.out.print(array[i]+" ");      
}
}
}
