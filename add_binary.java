import java.util.Scanner;

public class  add_binary 
{
public static void main(String[] args) 
{	
	//  ADD THE  BINARY NUMBERS 
       Scanner sc = new Scanner (System.in);		
       System.out.println("Enter the first binary number ");
       String a = sc.next();
       System.out.println("Enter the  second binary number ");          
       String b = sc.next();
         
       int b1= Integer.parseInt(a,2);          
       int b2= Integer.parseInt(b,2);          
       int c= b1+b2 ;
          
       System.out.println("Addition of two binary number is : "+Integer.toBinaryString(c) );		
}
}