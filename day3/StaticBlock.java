class Sample {
  static {
    System.out.println("Static block called one time");
  }
	
	 static {
    System.out.println("Static block called two times");
  }
   static {
    System.out.println("Static block called three times");
  }
  
  Sample() {
    System.out.println("Constructor called");
  }

}

public class StaticBlock {

  public static void main(String[] args) {
    new Sample();
  }
}
