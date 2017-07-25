import java.io.*;
import java.util.*;
public class Main
{
public static void main(String args[])throws IOException
{
Scanner sc=new Scanner(System.in);
int n,i=0;
System.out.println("Enter number");
n=sc.nextLine();
while(n>0)
{
n=n/10;
i++;
}
Sysetm.out.println();
Sysetm.out.println("The num of digit present"+i);
}
}

