
class A 
{}

class B extends A 
{}

public class GetSuperClass
{
public static void main(String[] args)  throws ClassNotFoundException
{
		Class cls = B.class; 
	
		System.out.println("The superclass is: " + cls.getSuperclass());
}
}
