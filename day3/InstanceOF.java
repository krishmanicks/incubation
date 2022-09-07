class Demo {
String n = "krish";
}

class Hello extends Demo {

}

class InstanceOF {

public static void main(String[] args) {

String name = "Programiz";

boolean result1 = name instanceof String;
System.out.println("name is an instance of String: " + result1);

InstanceOF obj = new InstanceOF();
Hello d = new Hello();
boolean res3 = d instanceof Demo;
boolean result2 = obj instanceof InstanceOF;
System.out.println("obj is an instance of InstanceOF: " + result2);
System.out.println("d is an instance of Demo: " + res3);
}
}