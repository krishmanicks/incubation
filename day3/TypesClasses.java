public class TypesClasses {

  public static void main(String[] args) throws ClassNotFoundException {
    Class cls1 = Class.forName("java.lang.String");
    Class cls2 = String.class;
    Class cls3 = int.class;

    System.out.println("Class represented by cls1: " + cls1);
    System.out.println("Class represented by cls2: " + cls2);
    System.out.println("Class represented by cls3: " + cls3);
  }
}
