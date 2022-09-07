class Sample {
	
	void sayHello() {
    System.out.println("Hello World");
  }
	Sample retObj() {
		return this;
	}
}

class MethodReturning {
	
	public static void main(String args[]) {
		Sample s1 = new Sample();
		Sample s2 = s1.retObj();
		s1.sayHello();
		s2.sayHello();
	}
}