public class RemoveDuplicate
{
public static int remdup(int [] arr,int n)
{
if(n==1 || n==0)
{
return n;
}
int j=0;
for(int i=0;i<n-1;i++)
{
if(arr[i]!=arr[i+1])
{
arr[j++]=arr[i];
}
}
arr[j++]=arr[n-1];
return j;  
}
public static void main(String[] args) 
{
int array[]={1,2,2,3,3,4,5,5};
int len=array.length;
len=remdup(array,len);
System.out.println("Array without duplicate elements:")
for(int i=0;i<len;i++){
System.out.print(array[i]+" ");
}
}
}