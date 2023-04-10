
// ADD THE NUMBER UNTILL THE SINGLE DIGIT

public class single_digit {

public static void main(String [] args)  
{	 

int num = 3462;

System.out.println("Given Number-3462");

System.out.println("sum of single digit is "+digSum(num));

}

private static int digSum(int num) {
	 	
	int sum =0;
	
	while(num>0 || sum>9)
	{
		
		if (num  == 0)
		{			
			num = sum;
			sum =0;
		}		
		sum = sum+num%10;
		num= num/10;				
	}
	return sum; 

}
}

