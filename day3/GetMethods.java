import java.lang.reflect.Method;

public class GetMethods {
  public static void main(String[] args) throws ClassNotFoundException {
    Class cls = Class.forName("java.lang.Integer");

    Method methods[] = cls.getMethods();

    System.out.println("Methods of Integer class: ");
    for (Method method: methods)
      System.out.println(method);
  }
}
