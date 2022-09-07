public class CheckPrimitive {

  public static void main(String[] args) throws ClassNotFoundException {
    Class cls1 = int.class;
    Class cls2 = Class.forName("CheckPrimitive");

    boolean res1 = cls1.isPrimitive();
    boolean res2 = cls2.isPrimitive();

    System.out.println("Is int a primitive type : " + res1);
    System.out.println("Is CheckPrimitive a primitive type : " + res2);
  }
}
