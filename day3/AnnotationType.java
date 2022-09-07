@interface A {

}

class B {}

public class AnnotationType {
	
  public static void main(String[] args) throws ClassNotFoundException {
    Class cls1 = A.class;
    Class cls2 = AnnotationType.class;
    Class cls3 = B.class;

    if (cls1.isAnnotation())
      System.out.println("The cls1 is representing an annotation type");
    else
      System.out.println("The cls1 is not representing an annotation type");

    if (cls2.isAnnotation())
      System.out.println("The cls2 is representing an annotation type");
    else
      System.out.println("The cls2 is not representing an annotation type");
  
  if (cls3.isAnnotation())
      System.out.println("The cls3 is representing an annotation type");
    else
      System.out.println("The cls3 is not representing an annotation type");
  }
}