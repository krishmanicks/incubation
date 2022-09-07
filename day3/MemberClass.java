
class A {

}
public class MemberClass {
  class B {}

  public static void main(String[] args) throws ClassNotFoundException {
    Class cls1 = A.class;
    Class cls2 = B.class;

    if (cls1.isMemberClass())
      System.out.println("The cls1 is representing a member class");
    else
      System.out.println("The cls1 is not representing a member class");

    if (cls2.isMemberClass())
      System.out.println("The cls2 is representing a member class");
    else
      System.out.println("The cls2 is not representing a member class");
  }
}