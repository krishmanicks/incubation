import java.util.*;

class Petrol {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int petrol = sc.nextInt();
		int n = sc.nextInt();
		int dis[] = new int[n];
		int capa[] = new int[n];
		
		for(int i=0;i<n;i++) {
			dis[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			capa[i] = sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			petrol = petrol - dis[i];
			if(petrol <= 0) {
				System.out.println("cannot travel");
				break;
			}
			petrol += capa[i];
		}
			if(petrol > 0) 
				System.out.println("Remaining petrol in car " + petrol);
	}
}