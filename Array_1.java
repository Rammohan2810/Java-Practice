import java.util.ArrayList;
import java.util.Arrays;
public class Array_1{
  public static void  main(String[] args) 
  {
  String[]  my_array = new String[] {"Python", "JAVA", "PHP", "C#", "C++"};
  ArrayList<String>  list = new ArrayList<String>(Arrays.asList(my_array));
  
  System.out.println(list);
  }
}