import java.util.*;

class Move0 {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int arr[] = {1,0,5,0,7,9,6,0,8};
		int j = arr.length;
		int k=0;
		int count0 = 0;
		
		for(int i=0;i<j;i++) {
			if(arr[i] != 0) {
				arr[k] = arr[i];
				k++;
			}
			else if(arr[i] == 0) {
				count0++;			
			}
		}
		while(count0 > 0) {
			arr[k] = 0;
			k++;
			count0--;
		}
		
		for(int ele: arr) {
			System.out.print(ele + " ");
		}
}

}
