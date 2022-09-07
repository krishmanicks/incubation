
import java.lang.reflect.Field;

public class GetField {
	
  public static void main(String[] args) throws ClassNotFoundException {
    Class cls = Class.forName("java.lang.Integer");

    Field fields[] = cls.getFields();

    System.out.println("Fields of Double class: ");
    for (Field field: fields)
      System.out.println(field);
  }
}
