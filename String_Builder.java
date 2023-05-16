/* StringBuilder is non-synchronized i.e. not thread safe. 
It means two threads can call the methods of StringBuilder
simultaneously.StringBuilder is more efficient than 
StringBuffer.StringBuilder was introduced in Java 1.5 */

public class String_Builder
{  
public static void main(String args[])
{  
StringBuilder sb=new StringBuilder("Hello ");  
sb.append("Java"); 
System.out.println(sb); 
System.out.println(sb.capacity());
sb.replace(6,10,"Python");  
System.out.println(sb);
System.out.println(sb.reverse()); 
}  
}  