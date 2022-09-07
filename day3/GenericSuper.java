
public class GenericSuper {
  public static void main(String[] args) throws ClassNotFoundException {
    Class cls1 = Class.forName("GenericSuper");
    Class cls2 = Class.forName("java.util.ArrayList");
    Class cls3 = Class.forName("java.lang.String");
    Class cls4 = int.class;

    System.out.println("The generic superclass is: " + cls1.getGenericSuperclass());
    System.out.println("The generic superclass is: " + cls2.getGenericSuperclass());
    System.out.println("The generic superclass is: " + cls3.getGenericSuperclass());
    System.out.println("The generic superclass is: " + cls4.getGenericSuperclass());
  }
}
