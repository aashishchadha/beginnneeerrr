import java.util.*;
import java.lang.*;
import java.io.*;
class Number_type
{
public static void main(String args[])
{
Scanner s = new Scanner(System.in);
System.out.println("Enter the number");
int n = s.nextInt();
if(n>0)
System.out.println("Positive Number");
else if(n<0)
System.out.println("Negetive Number");
else
System.out.println("Zero");
}
}