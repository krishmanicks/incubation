class Demo {
	int n;
}

class CheckClass {

  public static void main(String[] args) throws ClassNotFoundException//, IllegalAccessException, InstantiationException 
  {
    Class cls = Class.forName("CheckClass");
    Class cls2 = Class.forName("Demo");
	
	Demo d = new Demo();
	
    CheckClass m = new CheckClass();
    int val = 50;

    boolean res1 = cls.isInstance(m);
    boolean res2 = cls.isInstance(val);
    boolean res3 = cls2.isInstance(d);

    System.out.println("Is m instance of CheckClass   : " + res1);
    System.out.println("Is val instance of CheckClass : " + res2);
    System.out.println("Is d instance of Demo : " + res3);
  }
}
