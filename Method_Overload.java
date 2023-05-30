/* Method overloading is a feature of Java
in which a class has more than one method 
of the same name and their parameters are different */
public class Method_Overload
{
public static void main(String[] args) 
{

	add(10,20);
        mul(10,20,30);		
}
	private static void mul(int i, int j, int k) {		 
		int l = i*j*k;		
		System.out.println("Multiple of three numbers "+l);		
	}
	private static void add(int i, int j) {		 
		int k = i+j;
		System.out.println("The sum of two numbers is "+k);		
}
}
