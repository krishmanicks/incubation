import java.util.*;


public class ConvertToArrayList {

   public static void main(String args[]) {
   
      String[] array = {"a", "b", "c", "d", "e"};
      int[] arr = new int[] {1,2,5,8,5,7};

	  List<Integer> list1234 = new ArrayList<Integer>();
      List list = IntStream.of(arr).boxed().collect(Collectors.toList());;   
		//list1234.add(list1234, arr);
		for(int i: arr)	  
		{	
			 list1234.add(i);
		}
		System.out.println(list);
		
		// for(int i: arr)	  
		// {	
			 
		// System.out.println(i);
		// }

      // List<String> list1 = new ArrayList<String>();
      // Collections.addAll(list1, array);
      // System.out.println(list1);

      // List<String> list2 = new ArrayList<String>();
      // for(String text: array) {
         // list2.add(text);
      // }
      // System.out.println(list2);
   }  
}