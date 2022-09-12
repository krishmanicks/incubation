import java.util.*;

class StackArray {
	
	static int top = -1;
	static void push(int arr[], int x) {
		if(top > 6) {
			System.out.println("OverFlow");
			return;
		}
		arr[++top] = x;
		System.out.println(Arrays.toString(arr));
	}
	
	 static void pop(int arr[]) {
		if(top == -1) {
			System.out.println("UnderFlow");
			return;
		}
		top--;
	}
	
	static void display(int arr[]) {
		int n = top;
		while(n >= 0) {
			System.out.println(arr[n]);
			n--;
		} 
	}
	

	public static void main(String args[]) {
		int arr[] = new int[6];
		
		push(arr,5);
		push(arr,8);
		push(arr,2);
		display(arr);
		push(arr,1);
		//display(arr);
		pop(arr);
		display(arr);
	}
}