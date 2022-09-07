class hello {}

class GetClassLoader {

  public static void main(String[] args) throws ClassNotFoundException {
  
    Class cls1 = Class.forName("GetClassLoader");
    Class cls2 = Class.forName("java.lang.String");
    Class cls3 = int.class;
    Class cls4 = Class.forName("hello");;

    System.out.println("The class loader associated with cls1: " + cls1.getClassLoader());
    System.out.println("The class loader associated with cls2: " + cls2.getClassLoader());
    System.out.println("The class loader associated with cls3: " + cls3.getClassLoader());
    System.out.println("The class loader associated with cls4: " + cls4.getClassLoader());
  }
}
