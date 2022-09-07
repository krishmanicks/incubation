
class Person {
String name;
int age;

Person(int age, String name) {
this.name = name;
this.age = age;
}
}

class Employee {
int empid;
int empsalary;
Person P;

Employee(int id, String name, int age, int salary) {
P = new Person(age, name);
empid = id;
empsalary = salary;
}

void printDetails() {
System.out.println("Employee ID     :  " + empid);
System.out.println("Employee Name   :  " + P.name);
System.out.println("Employee Age    :  " + P.age);
System.out.println("Employee Salary :  " + empsalary);
}
}

public class AnotherDataclass {

public static void main(String[] args) {
Employee emp = new Employee(101, "manicks", 32, 223);
emp.printDetails();
}
}
