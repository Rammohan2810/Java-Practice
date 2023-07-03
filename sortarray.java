import java.util.Arrays;

public class sortarray 
{
public static void main(String[] args) 
{
	
     int [] array = {12,2,3,43,4,46,32,45,65};
     String [] arrays= {"dinesh","farina","elango","ashok","banu"};

              // Sort Numeric Array

     System.out.println("Orginal Numeric Array :"+Arrays.toString(array));
     Arrays.sort(array);
     System.out.println(); 
     System.out.println("Sorting Numeric Array :"+Arrays.toString(array));
     System.out.println();

             // Sort String Array

     System.out.println("Orginal String :"+Arrays.toString( arrays));
     Arrays.sort(arrays);
     System.out.println();
     System.out.println("Soring String : "+Arrays.toString(arrays));
}
}
