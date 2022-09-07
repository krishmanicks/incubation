
class Demo {
}

class ClassObject {

  public static void main(String[] args) throws ClassNotFoundException {
    int arr[] = new int[5];
	
	Demo arr1[] = new Demo[2];
	
    Class cls1 = arr.getClass();
    Class cls2 = float.class;
	Class cls3 = arr1.getClass();

    boolean res1 = cls1.isArray();
    boolean res2 = cls2.isArray();
    boolean res3 = cls3.isArray();

    System.out.println("Is " + cls1 + " an array : " + res1);
    System.out.println("Is " + cls2 + " an array : " + res2);
    System.out.println("Is " + cls3 + " an array : " + res3);
  }
}