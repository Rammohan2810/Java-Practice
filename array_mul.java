public class array_mul 
{
public static void main(String[] args) 
{
    int a[] = {2,3,5};
    int b[] = {5,6,8};
    int len = a.length ;
    int c[] = new int [len] ;
		
    for (int i=0 ; i<a.length ; i++)
	{			
	   c[i] = a[i] * b[i];			
	   System.out.println(c[i]); 
     	}
}
}		
		 