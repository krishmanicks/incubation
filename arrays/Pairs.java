import java.util.*;

class Pairs {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int arr[] = {1,9,5,8,6,2,7};
		System.out.println("Enter the number to find ");
		int find = sc.nextInt();
		Arrays.sort(arr);
		int j = arr.length - 1;
		int i=0,flag = 0;
		
		while(i<j) {
			if(arr[i] + arr[j] == find) {
				System.out.println("found");
				flag = 1;
				break;
			}
			if(arr[i] + arr[j] > find) {
				j--;
			}
			if(arr[i] + arr[j] < find) {
				i++;
			}
		}
		if(flag == 0)
			System.out.println("not Found");
	}
}
