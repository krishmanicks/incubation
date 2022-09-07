class ConstructorOverloading {

int id;
String name;

ConstructorOverloading() {
System.out.println("created Constrcutor");
}

ConstructorOverloading(int i, String n) {
id = i;
name = n;
}


public static void main(String args[]) {
ConstructorOverloading co = new ConstructorOverloading();
System.out.println("Before ");
System.out.println("Id is " + co.id + " name is " + co.name);

ConstructorOverloading con = new ConstructorOverloading(12,"krish");

System.out.println("After ");
System.out.println("Id is " + con.id + " name is " + con.name);


}
}