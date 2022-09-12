import java.util.*;

class QueueArray {
	
	static int front = 0;
	static int back = 0;
	static void Queues(int arr[], int x) {
		if(back > 6) {
			System.out.println("OverFlow");
			return;
		}
		arr[back++] = x;
	}
	
	 static void DeQueues(int arr[]) {
		if( front == -1) {
			System.out.println("UnderFlow");
			return;
		}
		front++;
	}
	
	static void display(int arr[]) {
		int n = front;
		while(n < back) {
			System.out.println(arr[n]);
			n++;
		} 
	}
	

	public static void main(String args[]) {
		int arr[] = new int[6];
		
		Queues(arr,5);
		Queues(arr,8);
		Queues(arr,2);
		//display(arr);
		Queues(arr,1);
		//display(arr);
		//DeQueues(arr);
		display(arr);
	}
}