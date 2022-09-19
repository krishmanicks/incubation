import java.util.*;

class TreesGreater {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		boolean istrue = true;
		
		TreeSet<Integer> trees = new TreeSet<Integer>();
		  trees.add(1);
		  trees.add(3);
		  trees.add(6);
		  trees.add(7);
		  trees.add(11);
		  
		  System.out.println(trees + "\n");
		  System.out.println("Enter the number to find greater");
		  
		  int a = sc.nextInt();
		  
		   System.out.println("Greater value : " + trees.ceiling(a));
		   System.out.println("Lesser value : " + trees.floor(a));
		   
			System.out.println("First lowest element " + "removed is : " + trees.pollFirst());
			
			System.out.println("After removing" + trees);
		}
	}