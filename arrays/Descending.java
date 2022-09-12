import java.util.*;

class Descending {

	static void sort(int arr[]) {
		 int size = arr.length;
		 
		for(int i=0;i<size-1;i++) {
			for(int j=0;j<size-i-1;j++) {
				if(arr[j] < arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		for(int j: arr)
			System.out.print(j + "\t");
	}
	
	public static void main(String args[]) {
		
		int arr[] = {4,7,2,9,1,99,34,45};
		
		sort(arr);
	}
}