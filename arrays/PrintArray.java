import java.util.*;

class PrintArray {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		System.out.println("Enter 10 numbers ");
		for(int i=0;i<10;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i: arr) {
				System.out.print(i + " ");
		}
		
	}
}
