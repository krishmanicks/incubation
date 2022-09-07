public class LocalClass {

  public static void main(String[] args) //throws ClassNotFoundException 
  {
  
    class Local {
    }

    Class cls1 = Class.forName("LocalClass");
    Class cls2 = Local.class;

    if (cls1.isLocalClass())
      System.out.println("The cls1 is representing a local class");
    else
      System.out.println("The cls1 is not representing a local class");

    if (cls2.isLocalClass())
      System.out.println("The cls2 is representing a local class");
    else
      System.out.println("The cls2 is not representing a local class");
  
  }
}
