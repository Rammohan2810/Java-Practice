
import java.util.* ;

public class OTP {

public static void main (String [] args) {

 String num = "0123456789";

 int len = 6;
 
char [] otp = new char [ len ] ;

Random r = new Random ();

for (int i=0;i<len;i++)

{

otp [i] = num.charAt(r.nextInt(num.length ()));

}

System.out.println ("OTP - "+ new String(otp));

}

}












