import java.util.*;


class Palindrome {
	
	public void sorting(int arr[]) {
		 int size = arr.length;
		 
		for(int i=0;i<size-1;i++) {
			for(int j=0;j<size-i-1;j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}

class Sort {
	
	public static void main(String args[]) {
		
		Palindrome p = new Palindrome();
		
		Scanner sc = new Scanner(System.in);
		int arr[] = {4,7,2,4,1,0,55,23};
		String str[] = {"amer", "vickram", "senadhi", "balu", "golu"};
		p.sorting(arr);
		Arrays.sort(str);
		for(int i: arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		for(String i: str) {
			System.out.print(i + " ");
		}
		
		
	}
}
