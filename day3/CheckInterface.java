interface Demo {
	
}
class Hello implements Demo {
	
}


class CheckInterface {

  public static void main(String[] args) throws ClassNotFoundException {
  
    Class cls1 = Class.forName("CheckInterface");
    Class cls2 = Class.forName("java.lang.Runnable");
    Class cls3 = Class.forName("Demo");
    Class cls4 = Class.forName("Hello");

    boolean res1 = cls1.isInterface();
    boolean res2 = cls2.isInterface();
    boolean res3 = cls3.isInterface();
    boolean res4 = cls4.isInterface();

    System.out.println("Is CheckInterface an interface : " + res1);
    System.out.println("Is java.lang.Runnable an interface : " + res2);
    System.out.println("Is Demo an interface : " + res3);
    System.out.println("Is Hello an interface : " + res4);
  }
}
