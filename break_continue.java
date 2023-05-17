public class break_continue 
{	
public static void main(String[] args) 
{    
            // break statement
/*The "break" statement is used to terminate the innermost loop or 
switch statement in which it is encountered. When the "break" statement 
is executed, the control immediately exits the loop or switch statement, 
and the program continues with the next statement after the loop or switch block.*/
 	System.out.println("break statement-");
	for(int i=1;i<=10;i++)
		{  
		        if(i==5)
			{  		              
		            break;  
		        }                        
		      System.out.println(i);  
		 }  
           // continue statement
/*The "continue" statement is used to skip the remaining statements within the loop
block for the current iteration and proceed with the next iteration. 
When the "continue" statement is encountered, the control immediately jumps
 to the loop's next iteration, bypassing the remaining code for 
the current iteration */
 	System.out.println("continue statement-");
        for(int j=1;j<=10;j++)
		{  
		        if(j==6)
			{  		              
		            continue;  
		        }                        
		      System.out.println(j);  
		 } 	 
}
}
