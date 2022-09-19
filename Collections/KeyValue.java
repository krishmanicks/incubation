import java.util.*;  

public class KeyValue {  

  public static void main(String args[]) {  
  
  HashMap<Integer,String> hash = new HashMap<Integer,String>();  
  HashMap<Integer,String> hash1 = new HashMap<Integer,String>();  
  HashMap<Integer,String> hash2 = new HashMap<Integer,String>();  
  
  hash.put(1, "Red");
  hash.put(4, "Green");
  hash.put(3, "Black");
  hash.put(2, "White");
  hash1.put(5, "Blue");
  hash1.put(7, "violet");
  hash1.put(1, "Orange");
  
     System.out.println(hash.size() + "\n"); 
     System.out.println(hash + "\n"); 
     System.out.println(hash1 + "\n"); 
	 
	 hash1.putAll(hash);
	 System.out.println("After mapping " + hash1 + "\n"); 
	 System.out.println(hash.isEmpty()); 
	 
	 hash2 = (HashMap)hash1.clone();  
	System.out.println(hash2 + "\n");

	 System.out.println("Collection view is: "+ hash2.values());
	 System.out.println("Collection view is: "+ hash2.keySet());
 }  
}
