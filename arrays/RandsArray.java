import java.util.*;

public class RandsArray {

   public static void main(String args[]) {
	   
      int[] arr = new int[100];
	  
      Random randNum = new Random();
	  int n = 101 - 0 + 1;
	  
      for (int i=0;i<100;i++) {
         arr[i] = randNum.nextInt() % n;
      }
      System.out.println("Random numbers = " + Arrays.toString(arr));
   }
}