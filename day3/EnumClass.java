
enum A {
  RED,
  GREEN,
  BLUE;
}

class EnumClass {

  public static void main(String[] args) throws ClassNotFoundException {
  
    Class cls1 = A.class;
    Class cls2 = EnumClass.class;

    if (cls1.isEnum())
      System.out.println("The cls1 is representing a Enum");
    else
      System.out.println("The cls1 is not representing a Enum");

    if (cls2.isEnum())
      System.out.println("The cls2 is representing an Enum");
    else
      System.out.println("The cls2 is not representing an Enum");
  }
}
