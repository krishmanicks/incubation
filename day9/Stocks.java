import java.util.*;


class Stocks {
	
	static void calculateSpan(int price[], int n) {
		
		  Deque<Integer> st = new ArrayDeque<Integer>();
			st.push(0);
			
		System.out.print("1 ");
  
        for (int i = 1; i < n; i++) {

            while (!st.isEmpty() && price[st.peek()] <= price[i])
                st.pop();

            if(st.isEmpty()) {			
				System.out.print((i + 1));
			}
			else 
				System.out.print((i - st.peek()) + " ");

            st.push(i);
        }
	}
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements ");
		int n = sc.nextInt();
		
		int[] price = new int[n];

		System.out.println("Enter array elements ");
		for(int i=0;i<n;i++)
			price[i] = sc.nextInt();
		
		calculateSpan(price,n);
	}
}