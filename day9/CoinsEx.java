import java.util.*;

class CoinsEx {
	
    static long calculateSpan(int coins[], int n, int sum)
    {

        long[] table = new long[sum + 1];

        Arrays.fill(table, 0);

        table[0] = 1;
 
        for (int i = 0; i < n; i++)
            for (int j = coins[i]; j <= sum; j++)
                table[j] += table[j - coins[i]];
 
        return table[sum];
    }
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements ");
		int n = sc.nextInt();
		
		int[] coins = new int[n];

		System.out.println("Enter array elements ");
		for(int i=0;i<n;i++)
			coins[i] = sc.nextInt();
		
		System.out.println("Enter the sum ");
		int sum = sc.nextInt();
		
		System.out.println(calculateSpan(coins,n, sum));
	}
}