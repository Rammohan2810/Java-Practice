public class division  
{ 	 
public static void main(String[] args) 
{
		System.out.println("Divisible of 3");			
		for (int i =1;i<100;i++)
		 {
			if (i%3 == 0)
		 	{		 		  
		 		 System.out.print(i+ ",");
		 	 }		 	  
		 }
		 System.out.print("\n\nDivisible of 5 ");

        System.out.println();
		 for (int i=1;i<100;i++)
		 {		 	  
		 	  if (i%5 ==0)
		 {
		 		  System.out.print(i+",");		 		  
		 }		 	 		 	  
		 }     
      System.out.println();
      System.out.println();
	  System.out.println("Divisible of 3 & 5 ");

		 for (int i=1;i<100;i++)
		 {		 	  
		 if (i%3 == 0  &&  i%5 == 0)
		 	{		 		  
		 		  System.out.print(i+ ",");		 		  
		    }		 		 		 	  
		 }       
}
}		 