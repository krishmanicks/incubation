import java.util.*;

public class GrandChild
{
	
	public static int check(String Dim[][], String child, String str) {
		
		int count = 0;
		 for (int k=0;k<Dim.length;k++)
			 {
				 
				 if (Dim[k][1] == child)
				 {
					 count++;				 
				 }
				 
			 }
		return count;
	}

	public static void main(String[] args) 
	{
		
		String Dim[][] = {{"luke","wayne"},{"wayne","rooney"},{"rooney","ronaldo"},{"shaw","rooney"}};
	    String child = "";
	    int count = 0;

		Scanner in = new Scanner(System.in);
		System.out.println("Enter Name");
		String str = in.nextLine();
	    
		
		 for (int i=0;i<Dim.length;i++)
		 {
			 if (Dim[i][1].equals(str))
				 {
						 child = Dim[i][0];
						  count = count + check(Dim,child, str);						 
				 }			
		 }
		 System.out.println("No: of Grand children " + str + " : " + count);

  }
}