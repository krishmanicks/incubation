import java.util.*;

class MenuDriven {
	
	static int i=0;
	
	static Scanner sc = new Scanner(System.in);
	
	static void accept(int arr[]) {

		System.out.println("Enter the number of elements");
		int n = sc.nextInt();
		System.out.println("Enter the elements");
		for(i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
	}
	
	static void display(int arr[]) {
		 int size = arr.length;
		System.out.println("The elemnts are ");
		for(int j=0;j<size;j++) {
			System.out.print(arr[j]+"\t");
		}
	}
	
	static void search(int arr[]) {
		int size = arr.length;
		System.out.print("Enter the element to search: ");
		int find = sc.nextInt();
		for(int j=0;j<size;j++) {
			if(arr[j] == find ) {
				System.out.print(arr[j]+"\t found!!");
				break;
			}
		}
	}
	
	static void sort(int arr[]) {
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
		
		for(int j: arr)
			System.out.println(j + "\t");
	}
	
	public static void main(String args[]) {
		
		int arr[] = new int[10];
		boolean istrue = true;
		Scanner sc = new Scanner(System.in);
		
		while(istrue) {
			System.out.println("1. Accept");
			System.out.println("2. Display");
			System.out.println("3. Search");
			System.out.println("4. Sort");
			System.out.println("5. Exit");
			
			int ch = sc.nextInt();
			
			
			switch(ch) {
				case 1: 
					accept(arr);
					break;
				case 2: 
					display(arr);
					break;
				case 3: 
					search(arr);
					break;
				case 4: 
					sort(arr);
					break;
				case 5:
					istrue = false;
					break;
			}
		}
	}
}