/*class Chaining {
	
	Chaining() {
		this("manicks");
		System.out.println("default ");
	}
	Chaining(String n) {
		System.out.println(n);
	}

	public static void main(String args[]) {
		Chaining ch = new Chaining();
	}
} */

class Demo  
{  
Demo()  
{  
this(80, 90);  
System.out.println("Base class default constructor called");  
}  
Demo(int x, int y)  
{  
System.out.println("Base class parameterized constructor called");  
}  
}  

class Prototype extends Demo  
{   
Prototype()  
{  
this("Java", "Python");  
System.out.println("Derived class default constructor called");  
}   
Prototype(String str1, String str2)  
{  
super();  
System.out.println("Derived class parameterized constructor called");  
}  
}  
public class ConstructorChaining  
{  
public static void main(String args[])   
{    
Prototype my_example = new Prototype();  
}   
}  