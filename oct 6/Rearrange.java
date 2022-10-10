import java.util.*;

class Rearrange {
	
	public static void sorting(int a[],int n) {
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				int temp = 0;
			   if(i%2 == 0){			   
				   if(a[i]<a[j]) {
					   temp = a[i];
					   a[i] = a[j];
					   a[j] = temp;
				   }
			   }
			   else {
				   if(a[i]>a[j]) {
					   temp = a[i];
					   a[i] = a[j];
					   a[j] = temp;
				   }
			   }
			}
		}
	}
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		
		sorting(arr,n);
		
		for(int i: arr)
			System.out.print(i + " ");
	}
}