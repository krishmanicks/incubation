import java.util.*;

class FindNumber {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		int flag = 0;
		int find;
		System.out.println("Enter 10 numbers ");
		for(int i=0;i<10;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter the number to find: ");
		find = sc.nextInt();
		for(int i: arr) {
			if(i == find) {
				flag = 1;
				System.out.println(i + " found");
				break;
			}
		}
		if(flag == 0) {
			System.out.println("Not found");
		}
	}
}