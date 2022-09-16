import java.util.*;

class Platforms {
	
static int count(int arr[],int dep[], int n)
 {
    int max = 1;
	int count = 1; 
	
    int i=1,j=0;
	
	Arrays.sort(arr);
	Arrays.sort(dep);
	
	while(i<n && j<n) {
		
		if(arr[i] <= arr[j]) {
			count++;
			i++;
		}
		else if(arr[i] > arr[j]){
			j++;
			count--;
		}
		if(count > max) 
			max = count;
	}
	return max;
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
		
		System.out.println("Minimum number of Platforms required " + count(arr,dep,n));
	}
}