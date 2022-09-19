import java.util.*;

class InsList {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		boolean istrue = true;
		ArrayList<Integer> lists = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(5);
		list2.add(3);
		list2.add(7);
		
		while(istrue) {
			
			System.out.println("1. insert at first ");
			System.out.println("2. retrieve at specified ");
			System.out.println("3. search ");
			System.out.println("4. compare two arrayLists");
			System.out.println("5. print all ");
			System.out.println("6. Exit ");
			
			int ch = sc.nextInt();
			
			if(ch == 6) {
				istrue = false;
				break;
			}
			else if(ch == 1) {
				System.out.println("enter the element to insert");
				int a = sc.nextInt();
				lists.add(0,a);
			}
			else if(ch == 2) {
				System.out.println("enter the element to retrieve");
				int index = sc.nextInt();
				System.out.println(lists.get(index));
			}
			else if(ch == 3) {
				System.out.println("enter the element to search");
				int search = sc.nextInt();
				System.out.println(lists.indexOf(search));
			}
			else if(ch == 4) {
				System.out.println("comparing ");
				System.out.println(lists.equals(list2));
				//System.out.println(lists.contentEquals(list2));
			}
			else if(ch == 5) {
				System.out.println("Printing all ");
				for(int i: lists)
					System.out.println(i + "  ");
			}
		}
	}
}