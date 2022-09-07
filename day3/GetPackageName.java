
public class GetPackageName {

  public static void main(String[] args) throws ClassNotFoundException {
  
    Class cls1 = Class.forName("java.util.Set");
    Class cls2 = Class.forName("java.lang.String");

    System.out.println("Package names: ");
    System.out.println(cls1.getPackage());
    System.out.println(cls2.getPackage());
  }
}
