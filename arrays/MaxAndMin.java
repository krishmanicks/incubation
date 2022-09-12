import java.util.*;


class Maximum {
	
	public void find(int arr[]) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int i: arr) {
			if(i > max)
				max = i;
			if(i < min) 
				min = i;
		}
		System.out.println("max " + max + "   " + "min " + min);
	}
}

class MaxAndMin {
	
	public static void main(String args[]) {
		
		Maximum m = new Maximum();
		
		Scanner sc = new Scanner(System.in);
		int arr[] = {4,7,2,4,1,0,55,23,66,-5};
		m.find(arr);
			
	}
}
