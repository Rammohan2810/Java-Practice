public class  multi_dimensional  
{
public static void main(String[] args) 
{	 
  char  ch  [][] = new char[][] {{'A','B','C'},{'D','E','F'},{'G','H','K'} };
  System.out.println("Multi Dimensional Array is");
	for(char i=0;i<ch.length;i++)
	   {			
	    for(char j=0;j<ch.length;j++)
		{			
		   System.out.print( ch[i][j]+" ");
		}			
	    System.out.println();			
	   }
}
}
