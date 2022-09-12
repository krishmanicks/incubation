import java.util.*;

class MoveZeroesAndOnes {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int arr[] = {1,0,1,0,0,0,1,0,1};
		int size = arr.length;
		int last = size-1;
		int first = 0;
		int i = 0;
		while(i!= size) {
			
			if(arr[i] == 0) {
				int temp = arr[i];
				arr[i] = arr[first];
				arr[first] = temp;
				first++;
			}
			else {
				int temp = arr[i];
				arr[i] = arr[last];
				arr[last] = temp;
				last--;
			}	
			i++;
		}

		for(int j: arr) {
			System.out.print(j + " ");
		}
	}
}
