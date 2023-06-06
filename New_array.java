public class New_array
{	
public static void main (String [] args ) 
{		 
int arrr[] = new int [] {12,13,14,53,36,54};
 
int  position = 3;
int value = 20;

int newarray [] = new int[arrr.length];

for(int i=0;i<arrr.length;i++)
{
	newarray[i] = arrr[i];
}

newarray[position] = value;

for(int i=position+1;i<newarray.length;i++)
{
	newarray[i] = arrr[i-1];	
}
arrr = newarray;

for(int i=0;i<arrr.length;i++)
{
	System.out.println(arrr[i]);
}

}  
} 