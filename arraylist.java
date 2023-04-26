import java.util.ArrayList;

public class arraylist 
{ 
public static void main(String[] args) 
{ 
   ArrayList <String> cars = new ArrayList <String> ();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
   cars.set(2,"Toyoto");
    System.out.println(cars);
} 
}
