
import java.lang.reflect.Constructor;

public class GetConstructor {

  public static void main(String[] args) throws ClassNotFoundException {
  
    Class cls = Class.forName("java.lang.Integer");
    Constructor ctors[] = cls.getConstructors();

    System.out.println("Constructors of Integer class: ");
    for (Constructor ctor: ctors)
      System.out.println(ctor);
  }
}
