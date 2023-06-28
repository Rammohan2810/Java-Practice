import java.util.Scanner;

public class Prime {
public static void main(String [] args){

Scanner sc = new Scanner(System.in);

System.out.print("Enter the number-");

int num = sc.nextInt();

boolean prime = true;

int i=2;

while(i<num){
if(num%i == 0){
     System.out.println("It's Not Prime Number");
     prime = false;
     i = i+1;
break;
}

if(prime == true){
     System.out.println("It's Prime Number");
break;
}
}
}
}
