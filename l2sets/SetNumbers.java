import java.util.*;

class SetNumbers {
	
	public static boolean perfect(int temp) {
	
		for(int i=1;i<temp/2;i++) {
			if(i*i == temp) {
				return true;
			}
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
	
	
	public static void findNumber(int arr[], int n) {

		int b[] = new int[n];
		
		for(int i=0;i<n;i++) {
			int temp = arr[i];
			int sum = 0;
			if(temp %4 == 0 && temp%6 == 0)
				sum += 4;
			if(temp%2 == 0)
				sum += 3;
			if(perfect(temp))
				sum += 5;
			
			b[i] = sum;
		}

		sorting(arr,b,n);
		
		for(int i=0;i<n;i++) {
			System.out.print("<" + arr[i] + "," + b[i]+ ">,");
		}
	}
		
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		
		findNumber(arr,n);
	}
}