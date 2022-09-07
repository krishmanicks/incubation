import java.lang.reflect.Field;

public class DefinedClasses {

  public interface Inf {}

  public class Sample implements Inf {}

  public static void main(String[] args) throws ClassNotFoundException {
  
    Class cls = DefinedClasses.class;
    Class[] classes = cls.getClasses();

    System.out.println("Classes and Interfaces defined in Main class: ");
    for (Class cl: classes)
      System.out.println(cl);
  }
}
