public class Binary
{
public static void binary(int [] arr,int first, int last,int key)
{
int mid=(first+last)/2;
while(first<=last)
{
if(arr[mid]<key)
{
first=mid+1;
}
else if(arr[mid]==key)
{
System.out.println("Key "+key+" found at index :"+mid);
break;
}
else
{
last=mid-1;
}
mid=(first+last)/2;
}
if(first>last)
{
System.out.println("Key not found");
}
}
public static void main(String[] args)
{
int [] array=new int []{1,2,3,4,5};
int key=4;
int last=array.length-1;
binary(array,0,last,key);
}
}