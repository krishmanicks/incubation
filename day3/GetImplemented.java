
interface inf1 {}

interface inf2 {}

class Sample implements inf1, inf2 {}


class demo implements inf2 {}

public class GetImplemented {

  public static void main(String[] args) throws ClassNotFoundException {
  
    Class cls = Class.forName("Sample");
    Class cInf[] = cls.getInterfaces();
	
	
	Class cls2 = Class.forName("demo");
    Class cInf3[] = cls2.getInterfaces();
  
  System.out.println("Interfaces implemented by demo class: ");
    for (Class inf: cInf3)
      System.out.println(inf);
  
  System.out.println("Interfaces implemented by Sample class: ");
    for (Class inf: cInf)
      System.out.println(inf);
  }
}
