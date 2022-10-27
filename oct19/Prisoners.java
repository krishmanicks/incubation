import java.util.*;

class Prisoners {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		System.out.println("Enter the number of prisoners ");
		int pris = sc.nextInt();
		
		System.out.println("Enter the k size ");
		int k = sc.nextInt();
		int hash[] = new int[pris*pris];
		for(int i=0;i<pris;i++) {
			al.add(i);
			hash[i] = 1;
		}
		
		//int count = 0;
		int temp = pris;

		int b[] = new int[pris*pris];
		int j = 0;
		int count = 0;
		while(temp > 0) {
			for(int i: al) {
				//count++;
				if(hash[i] != -1)
					count++;
				if(count == k) {
					int s = i;
					hash[i] = -1;
					b[j++] = s;
					count = 0;
					temp--;
				}
			}
		}
		j--;
		System.out.println("last prisoner is " + b[j]);
	}
}