import java.lang.*;  

public class ClassgetNameEx {  

   public static void main(String[] args) {  
   
      ClassgetNameEx obj = new ClassgetNameEx();  
      Class Class1 = obj.getClass();  
      String nm = Class1.getName();  
      System.out.println(" The Class Name = " +nm);
	  System.out.println("SimpleName of myClass: " + Class1.getSimpleName());
	  
   }  
}  