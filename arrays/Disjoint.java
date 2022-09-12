import java.util.*;

class Disjoint {
	
	static boolean check(int a[], int b[]) {
		for(int i: a) {
			for(int j: b) {
				if(i == j) 
					return false;
			}
		}
		return true;
	}

	public static void main(String args[]){

	Scanner sc = new Scanner(System.in);

	int[] a = {10,12,20,30,25,40,32,31,35,50,60};

	int[] b = {11,55,77,66,10};
	
	System.out.println(check(a,b));
}
} 