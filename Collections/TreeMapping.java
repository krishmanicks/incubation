import java.util.*;  

public class TreeMapping {  

  public static void main(String args[]){  

   TreeMap<Integer,String> tree = new TreeMap<Integer,String>();      
   TreeMap<Integer,String> tree1 = new TreeMap<Integer,String>();      

  tree.put(1, "Red");
  tree.put(2, "Green");
  tree.put(5, "Black");
  tree1.put(4, "White");
  tree1.put(3, "Blue");
    
   for (Map.Entry i : tree.entrySet())
   {
    System.out.println(i.getKey() + " - " + i.getValue());
   }
   
   tree1.putAll(tree);
   System.out.println(tree1);
   
   System.out.println("Greatest key: " + tree1.firstEntry());
  System.out.println("Least key: " + tree1.lastEntry());
  System.out.println("Orginal TreeMap content: " + tree1.navigableKeySet());
  
   System.out.println("Keys greater than or equal to 20: " + tree1.ceilingEntry(2));
  System.out.println("Keys greater than or equal to 40: " + tree1.ceilingEntry(4));
  System.out.println("Keys greater than or equal to 50: " + tree1.ceilingEntry(5));
  System.out.println("Keys greater than or equal to 50: " + tree1.ceilingEntry(0));
 }  
}
