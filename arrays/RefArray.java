import java.util.*;

class RefArray {

	public static void main(String args[]){

	Scanner sc = new Scanner(System.in);

	int[] a = new int[] {10,12,20,30,25,40,32,31,35,50,60};

	int[] b = new int[11];
	
	b = a;

	System.out.println("Array is : ");

	for(int i=0;i<b.length;i++){
		System.out.print(b[i]+"\t");
	}

}
} 