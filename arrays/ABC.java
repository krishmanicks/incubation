import java.util.*;

class ABC {
	
	static void merge(int a[], int b[], int c[]) {
		
		int i=0,j=b.length-1,k=0;
		
		while(i != a.length && j>=0) {
			if(a[i] < b[j]) {
				c[k++] = a[i];
				i++;
			}
			else {
				c[k++] = b[j];
				j--;
			}
		}
		
		while(i != a.length) {
			c[k++] = a[i];
			i++;
		}
		while(j>=0) {
			c[k++] = b[j];
			j--;
		}
		
		for(int ele: c) 
			System.out.print(ele + "\t");
	}
	
	public static void main(String args[]) {
		
		int a[] = {1,4,6,8,10};
		int b[] = {12,9,7,5,3};
		int c[] = new int[10];
		
		merge(a,b,c);
	}

} 