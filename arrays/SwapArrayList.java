import java.util.*;

class SwapArrayList {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list1 = new ArrayList<Integer>()	;
		
		int n = 0;
		while(true) {
			
			n = sc.nextInt();
			if(n == -1) {
				break;
			}
			list1.add(n);
		}
		System.out.println(list1);
		System.out.println("\nEnter 2 indices:");
		int ind1 = sc.nextInt();
		int ind2 = sc.nextInt();
		
		 Collections.swap(list1, ind1, ind2);
		
		System.out.println(list1);
		
	}
}