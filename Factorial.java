public class Factorial 
{
public static void main(String[] args) 
{
        int num = 5;        
        long result = factorial(num);
        System.out.println(num + "! = " + result);
}
    public static long factorial(int n) 
        {
        if(n == 0 || n == 1) 
        { 
            return 1;
        }
        else 
        {             // recursive case
            return n * factorial(n-1);
        }
        }
}
