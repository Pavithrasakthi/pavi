import java.io.*;
import java.util.*;
public class Main
{
public static void main(String args[])throws IOException
{
//Scanner sc=new Scanner(System.in);
int base=3,exponent=4;
int result=1;
while(exponent!=0)
{
result*=base;
--exponent;
}
System.out.println("Ans="+result);
}
}
