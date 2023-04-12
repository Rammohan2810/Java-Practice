import java.util.Scanner;
// STRING REVERSE THE LETTERS
public class string 
{
public static void main(String [] args)  
{	  
Scanner sc = new Scanner (System.in);	  
System.out.print("Please enter the letters : ");
char [] letters =sc.nextLine().toCharArray();
System.out.print("Reverse letters is : ");

   for(int i=letters.length-1;i>=0;i--)
           {
             System.out.print(letters[i]);
           }
   System.out.print("\n"); 
}
}