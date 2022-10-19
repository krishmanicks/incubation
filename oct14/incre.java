import java.util.*;

class incre {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n+1];
		int sum = 0;
		int b[] = new int[n+1];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int j=0;j<n;j++) {
			sum = sum * 10 + arr[j];
		}
		sum++;
		int i = 0;
		int add = 0;

		while(sum > 0) {
			int rev = sum%10;
			add = add*10 + rev;
			sum = sum/10;
		}
		while(add > 0) {
			int rev = add%10;
			arr[i] = rev;
			add = add/10;
			i++;
		}

		for(int j=0;j<i;j++)
			System.out.print(arr[j]+ " ");
	}
}