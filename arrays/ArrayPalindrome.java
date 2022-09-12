import java.util.*;


class Palindrome {
	
	public boolean pal(int arr[]) {
		int i=0,j=9;
		while(i<=j) {
			if(arr[i] != arr[j])
				return false;
			i++;
			j--;
		}
		return true;
	}
}

class ArrayPalindrome {
	
	public static void main(String args[]) {
		
		Palindrome p = new Palindrome();
		
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		System.out.println("Enter 10 numbers ");
		for(int i=0;i<10;i++) {
			arr[i] = sc.nextInt();
		}		
		
		if(p.pal(arr)) {
			System.out.println("It is same");
		}
		else
		{
			System.err.println("It is not same");
		}
	}
}
