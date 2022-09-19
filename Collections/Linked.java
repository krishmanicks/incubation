import java.util.*;

class Linked {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		boolean istrue = true;

		try {
		LinkedList<Integer> lists = new LinkedList<Integer>(); 
		
		
		while(istrue) {
			
			System.out.println("1. insert at first ");
			System.out.println("2. retrieve at first and last ");
			System.out.println("3. clone ");
			System.out.println("6. insert at last ");
			System.out.println("7. Exit ");
			
			Integer ch = sc.nextInt();
			
			if(ch == 7) {
				istrue = false;
				break;
			}
			else if(ch == 1) {
				System.out.println("enter the element to insert");
				Integer a = sc.nextInt();
				lists.add(0,a);
			}
			else if(ch == 2) {
				System.out.println("enter the element to retrieve");
				
				System.out.println("first = " +lists.element());
				System.out.println("first = " +lists.getFirst());
				System.out.println("last = " +lists.getLast());
			}
			else if(ch == 3) {
				System.out.println("cloning");
				 LinkedList sec_list = new LinkedList();
				sec_list = (LinkedList) lists.clone();
				
				System.out.println("Second LinkedList is:" + sec_list);
			}
			else if(ch == 6) {
				System.out.println("insert at last ");
				Integer a = sc.nextInt();
				lists.addLast(a);
			}
		}
		} catch(Exception e) {}
		}
	}