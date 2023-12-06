public class StringReverse
{
public static void main(String[] args)
{
String str="Dream", rev=" ";
System.out.print("Origianl String : "+str);
System.out.println();
System.out.print("Reversed String : ");
for(int i=str.length()-1;i>=0;i--){
rev=rev+str.charAt(i);
}
System.out.print(rev);
}
}