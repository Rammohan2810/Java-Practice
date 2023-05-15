import java.io.BufferedReader;  

/* StringBuffer is synchronized.It is thread safe. 
It means two threads can't call the methods of StringBuffer 
simultaneously StringBuffer is less efficient than StringBuilder.
StringBuffer was introduced in Java 1.0 */

public class String_Buffer
{
public static void main(String[] args) 
{
	       StringBuffer buffer=new StringBuffer("Hello ");  
	       StringBuffer a = buffer.append("Java"); 
	       System.out.println(a);  
	       System.out.println("Length of a is-"+a.length());

	       StringBuffer b = buffer.replace(6, 10, "Python");	       
	       System.out.println(b);
	       System.out.println("Length of b is-"+b.length());		 
}
}
		 