
class Sample {
	
Sample Method1() {
System.out.println("Method1 called");
return this;
}	
Sample Method2() {
System.out.println("Method2 called");
return this;
}
Sample Method3() {
System.out.println("Method3 called");
return this;
}
}

class Cascaded {

public static void main(String args[]) {

Sample X = new Sample();
X.Method1().Method2().Method3();
new Sample().Method1().Method2().Method3();
}
}
