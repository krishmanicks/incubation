import java.util.*;

class RotateArray {
	
	public static void main(String args[]) {
		int n=5;
		int k = 2;
		int a[] = {1,2,3,4,5};
		int temp1 = a[n-1];
		
		while(k!=0) {
			
			for(int i=n-2;i>=0;i--) {
				
				int temp = a[i];
				a[i] = a[i+1];
				a[i+1] = temp;
			}
			k--;
		}
			for(int i: a) {
				System.out.print(i + " ");
		}
	}
}