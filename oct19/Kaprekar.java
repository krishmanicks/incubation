import java.util.* ;

class Kaprekar {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int kap[] = new int[10];
		int count = 0;
		
		while(n != 6174)
		{	
			int digit = 0;
			while(n!=0)
			{
				digit++;
				kap[n%10]++;
				n /= 10;
			}
			int min = 0;
			for(int i=0;i<10;i++)
			{
				int j = kap[i];
				while(j != 0)
				{
					min = min * 10 + i;
					j--;
				}
			}
			int max = 0;
			for(int i=9;i>=0;i--)
			{
				while(kap[i] != 0)
				{
					max = max * 10 + i;
					kap[i]--;
				}
			}
			if(digit <= 3)
			{
				max *= 10;
			}
			n = max - min;
			//System.out.println(max + " - " + min + " = " + (max-min));
			count++;
		}
		System.out.println(count);		
	}
}
