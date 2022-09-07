
interface Sample {
  public void print();
}

class Demo {

  public void createAnonymousClass() {

    Sample s1 = new Sample() {
      public void print() {
        System.out.println("Inside the anonymous class.");
      }
    };
    s1.print();
  }
}

public class AnonymousInterface {

  public static void main(String[] args) {
  
    Demo d = new Demo();
    d.createAnonymousClass();
  }
}
