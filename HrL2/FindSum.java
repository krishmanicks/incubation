import java.util.*;

class FindSum {
	
	public static boolean perfect(int temp) {
		for(int i=1;i<temp;i++) {
			if(i*i == temp) 
				return true;
		}
		return false;
	}
	
	public static void sorting(int arr[], int b[], int n) {
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(b[i] < b[j]) {
					int temp = b[i];
					b[i] = b[j];
					b[j] = temp;
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	public static void find(int arr[], int n) {
		
		int b[] = new int[n];
		
		for(int i=0;i<n;i++) {
			int sum = 0;
			int temp = arr[i];
			if(temp%2 == 0)
				sum+=2;
			if(temp%4 == 0 && temp%6 == 0)
				sum+= 4;
			if(perfect(temp))
				sum+=5;
			
			b[i] = sum;
		}
		
		sorting(arr,b,n);
		
		for(int i: arr)
			System.out.print(i + " ");
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter n");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		
		find(arr,n);
	}
}