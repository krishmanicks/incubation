import java.util.*;

class Colors {

  public static void main(String[] args) {
	  
	  Scanner sc = new Scanner(System.in);
  
  List<String> lists = new ArrayList<String>();
	
	for(int i=0;i<5;i++) {
		String s = sc.next();
		lists.add(s);
	}

  System.out.println(lists);
 }
}
