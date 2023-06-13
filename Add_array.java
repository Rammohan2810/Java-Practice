public class Add_array
{	 	
public static void main (String [] args) 
{		 
int arrr[] = new int [] {12,13,14,53,36,54};
int new_num [] = new int[arrr.length+1];

for(int i=0;i<arrr.length;i++)
{
     new_num [i] = arrr[i];
}
new_num[arrr.length] = 20;

for(int i=0;i<new_num.length;i++)
{
     System.out.println(new_num[i]);
}

}  
} 