import java.util.*;  

public class KeyHash {  

  public static void main(String args[]) {  
  
  HashMap<Integer,String> hash = new HashMap<Integer,String>();  
  
  hash.put(1, "Red");
  hash.put(2, "Green");
  hash.put(3, "Black");
  hash.put(4, "White");
  hash.put(5, "Blue");
  
     System.out.println(hash + "\n");
  
  for(Map.Entry x: hash.entrySet()) {  
  
   System.out.println(x.getKey() + "  -  " + x.getValue());  
  }  
	
 }  
}
