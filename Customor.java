public class Customor
{ 
   int aadhar_no,pan_no,atm_no;
   public customor(int  aadhar, int pan, int atm)
	{
		aadhar_no = aadhar;
		pan_no  = pan;
		atm_no  = atm ;
	}

	public static void main(String[] args) 
            {
		customor ram = new customor (1231,3443,45678);
		ram.applyloan();
   	    }
	private void applyloan() 
            {
		System.out.println("customor atm no is "+ atm_no);
       	    }
}
