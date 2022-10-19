import java.util.*;

class Dictionary {
	
	public static boolean dic(int i,int j,char[][] a,int count,String s) {
		int len = s.length();
		if(count == len)
			return true;
		
		if(j+1<4 && a[i][j+1] == s.charAt(count-1))
		{
			count++;
			return dic(i,j+1,a,count,s);
		}
		else if(i+1<4 && a[i+1][j] == s.charAt(count-1))
		{
			count++;
			return dic(i+1,j,a,count,s);
		}
		else
			return false;
	}
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		char arr[][] = new char[n][m];
		
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++)
				arr[i][j] = sc.next().charAt(0);
			
		int sizedic = sc.nextInt();
		
		String[] dic = new String[sizedic];
		
		for(int i=0;i<sizedic;i++) {
			dic[i] = sc.next();
		}
						
		int k=0,count=1;

		while(k < sizedic) {
			String temp = dic[k];
		
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					if(temp.charAt(0) == arr[i][j])
					{
						count++;
						if(dic(i,j,arr,count,temp))
						{
							System.out.println(temp);							
						}
					count = 1;
					}
				}		
			}
			k++;		
		}
	}
}