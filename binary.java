import java.util.Scanner;  

public class  binary
{
public static void main(String [] args)  
{
         Scanner sc = new Scanner (System.in);
 
	 System.out.println("Enter the decimal number- ");	
 
	 int a= sc.nextInt();
	 
	 System.out.println("Binary equvalant of "+a+ " is = ");
	 
	 System.out.println(Integer.toBinaryString(a));
}
}