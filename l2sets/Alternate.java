import java.util.*;

class Alternate {
	
	public static void swap(int arr[], int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++) 
			arr[i] = sc.nextInt();
		
		Arrays.sort(arr);
		
		int i=0,j=n-1;
		while(i < j) {
				swap(arr,i,j);
				i++;
				if(j == n-1) 
					swap(arr,i,j);
				else {
					if(j+1 > j+2) {
						swap(arr,i,j+2);
					}
					else 
						swap(arr,i,j+1);
				}
				j--;
				i++;
				
				for(int k: arr)
					System.out.print(k + " ");
				System.out.println();
		}
		
		// for(int k: arr)
			// System.out.print(k + " ");
	}
}