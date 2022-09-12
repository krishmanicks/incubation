import java.util.*;

class Equili {
	
	public static void main(String args[]) {
		
		int arr[] = {1,5,7,4,2};
		
		int sum =0,temp = 0;
		
		for(int i: arr) 
			sum += i;
		
		for(int i=0;i<arr.length;i++) {
			temp = arr[i] + temp;
			if(temp == sum) {
				System.out.println("equili index is " + i + " " + arr[i]);
				break;		
			}
			sum = sum - arr[i];
		}
	}
}