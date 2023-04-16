public class array
{

public static void main(String [] args)  
{	 	 
	int []arr = new int[] {23,43,24,21,12,75,4};
	int max = arr[0];

  for(int i=0;i<arr.length;i++)
	{
		 if(arr[i]>max)
		 max = arr[i];
	}
	System.out.println("The largest number in array is "+max);   	 	 
}
}