import java.util.*;

class SubString {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		int pos = -1;
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		
		int target = sc.nextInt();
		boolean istrue = true;
		for(int i=0;i<n;i++) {
			if(arr[i] == target) {
				System.out.println(i);
				break;
			}
			
			if(arr[i]+1 == target) {
				if(istrue) {
					pos = i+1;
					istrue = false;
				}
			}				
		}
		if(!istrue) {
			System.out.println(pos);
		}
	}
}