import java.util.*;

class PlatformsTrain {
	
static void count(int arr[],int dep[], int n)
 {
    int max = 1;
	int count = 1; 
	
    int i=1,j=0;
	
	Arrays.sort(arr);
	Arrays.sort(dep);
	
	while(i<n && j<n) {
		
		if(arr[i] <= dep[j]) {
			count++;
			i++;
		}
		else {
			j++;
			count--;
		}
		if(count > max) 
			max = count;
	}
	System.out.println(max);
 }
 
 
public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		int[] dep = new int[n];

		System.out.println("Enter arrival times ");
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		
		System.out.println("Enter departure times ");
		for(int i=0;i<n;i++)
			dep[i] = sc.nextInt();
		
		count(arr,dep,n);
	}
}