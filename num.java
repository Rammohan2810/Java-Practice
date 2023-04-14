import java.util.Scanner;

public class num {

public static void main(String [] args)  
{	 

Scanner sc = new Scanner (System.in );
	 
	 System.out.println("Enter the binary number ");
	 
       	 String a = sc.next ();
	
	 System.out.println("Decimal equivalent of "+ a + " is = ");
	 	 
	 System.out.println(Integer.parseInt(a, 2));  
}
}