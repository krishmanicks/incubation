import java.util.*;


class Find {
	
	public int sums(int arr[]) {
		int sum = 0;
			for(int i: arr) {
				sum += i;
		}
		return sum;
	}
	
	public int products(int arr[]) {
		int product = 1;
			for(int i: arr) {
				product *= i;
		}
		return product;
	}
}

class SumAndProduct {
	
	public static void main(String args[]) {
		
		Find f = new Find();
		
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		System.out.println("Enter 10 numbers ");
		for(int i=0;i<10;i++) {
			arr[i] = sc.nextInt();
		}		
		System.out.println("sum = " + f.sums(arr));
		System.out.println("product = " + f.products(arr));
	}
}
