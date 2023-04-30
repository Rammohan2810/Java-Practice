             // How to input without Scanner
import java.io.BufferedReader;
import java.io.InputStreamReader;
                 
public class  scan 
{
public static void main(String[] args) 
{   
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
	try {
		 System.out.println("Enter your name");
		 String s = br.readLine();
		 System.out.println("Your name is- "+s);
   	    } 		
        catch (Exception e) {
			System.out.println(e); 
		}
}
}