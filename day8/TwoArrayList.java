import java.util.*;

class TwoArrayList {
	
	public static void main(String args[]) {
	
		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
		ArrayList<String> list3 = new ArrayList<String>();
		
		list1.add("a");
		list1.add("b");
		list1.add("c");
		
		list2.add("x");
		list2.add("y");
		list2.add("z");
		list2.add("s");
		
		int i=0,j=0;
		
		 while (i < list1.size() && j < list2.size()) {
            list3.add(list1.get(i));
            list3.add(list2.get(j));
            i++;
            j++;
        }

        while (i < list1.size()) {
            list3.add(list1.get(i));
            i++;
        }

        while (j < list2.size()) {
            list3.add(list2.get(j));
            j++;
        }
		System.out.println(list3);

	}
}