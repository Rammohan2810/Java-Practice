public class SumNatural
{
public static void main(String[] args) 
{
        int num = 100; 
        int sum = 0;
        for(int i = 1; i <= num; ++i)
        {
            // sum = sum + i;
            sum += i;
        }

        System.out.println("First 100 Numbers of Sum is-" + sum);
}
}