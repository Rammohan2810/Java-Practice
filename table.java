import java.util.Scanner;
  
public class  table
{
public static void main(String [] args)  
{	 
 
Scanner sc = new Scanner (System.in);
	System.out.println("Enter the first input : ");
	int c = sc.nextInt();
for (int i=0;i<20;i++)
{
   System.out.println((i+1)+"*"+c+"="+(c*(i+1)));
}
}
}