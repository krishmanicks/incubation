import java.util.*;  

public class ReverseByWord 
{  
	public static void main(String[] arg)  
	{  
		ReverseByWord rs = new ReverseByWord();  
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter a string: ");  
		String  str=sc.nextLine();    
		System.out.println("Reverse of a String  is : "+rs.reversestr(str));
	}  
 
	static String reversestr(String s)  
	{  	
		int k=0;
		String r="";  
		for(int i=s.length();i>0;--i)
		{  
			r=r+(s.charAt(i-1));   
			System.out.print(r.charAt(k));
			k++;
		}  
		return r;  
	}  
} 