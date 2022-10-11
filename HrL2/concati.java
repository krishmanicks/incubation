import java.util.*;
public class concati
{	
	static Scanner sc = new Scanner(System.in);

	public static void read(String str[],int n)
	{
		for(int i =0;i<n ;i++)
			str[i] = sc.next();
	}
	
	public static void find(String str,String arr[])
	{
		String temp = "";
		for(int i =0;i<arr.length;i++)
		{	temp=arr[i];
			for(int j = 0;j<arr.length;j++)
			{
				if(i==j)
					continue;
				else 
					temp += arr[j];
			}

			int n = str.indexOf(temp);
			if(n>=0)
			{
			System.out.print(n + " ");
			}
		}
	}
	public static void main(String args[])
	{
		String str = sc.next();
		int n = sc.nextInt();
		String arr[] = new String[n];
		read(arr,n);
		find(str,arr);
	}
}
