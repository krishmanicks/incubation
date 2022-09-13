import java.util.*;

class Majority {
	
	static void maj(int a[]) {
		
        int index = 0, count = 1;
        int i,c=0;
        for (i = 1; i < a.length; i++) {
            if (a[index] == a[i])
                count++;
            else
                count--;
            if (count == 0) {
                index = i;
                count = 1;
            }
        }
        System.out.println(a[index]);
		
		for(i=0;i<a.length;i++) {
			if(a[index] == a[i]) 
				c++;
		}
		if(c > a.length/2) 
			System.out.println("majority element " + a[index]);
		else 
			System.out.println("No majority element");
    }
		
		public static void main(String args[]) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the number of elements:");
			int n = sc.nextInt();
			int arr[] = new int[n];
		
			System.out.println("Enter the array elements:");
			for(int i=0;i<n;i++) 
				arr[i] = sc.nextInt();
			
			maj(arr);
			
		}
}