import java.util.*;

class HashingSet {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		boolean istrue = true;

		try {
		
		HashSet<Integer> set = new HashSet();  
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		
		HashSet<Integer> set2 = new HashSet();  
		
		set2.add(1);
		set2.add(2);	
		set2.add(7);
		set2.add(9);
		set2.add(5);
		
		Integer arr[] = new Integer[set.size()];
		
		while(istrue) {
			
			System.out.println("1. iterate ");
			System.out.println("2. empty");
			System.out.println("4. convert hash set to array ");
			System.out.println("5. compare two set and retain same  ");
			System.out.println("6. Exit ");
			
			Integer ch = sc.nextInt();
			
			if(ch == 6) {
				istrue = false;
				break;
			}
			else if(ch == 1) {
				System.out.println("Iterating");
				System.out.println(set + "\n");
				
				  Iterator<Integer> itr = set.iterator();  
				  while(itr.hasNext()) {  
				   System.out.println(itr.next());  
				  }  

			}
			else if(ch == 2) {
				System.out.println("empting");
				
				set.clear();
				System.out.println(set);
			}
			else if(ch == 4) {
				System.out.println("converting");
			    set.toArray(arr);
			    for(int i: arr)
					System.out.println(" " + i);
			}
			else if(ch == 5) {
				System.out.println("retaining ");
				set.retainAll(set2);
				System.out.println(set);
			}
		}
		} catch(Exception e) {}
		}
	}
	