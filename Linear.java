public class Linear
{
public static int linear(int [] arr,int key)
{
for(int i=arr.length-1;i>=0;i--)
{
if(arr[i]==key)
return i;
}
return -1;
}
public static void main(String[] args) 
{
int [] array=new int []{1,2,3,4,5};
int key=4;
System.out.println("Key "+key+" found at index :"+linear(array,key));
}
}