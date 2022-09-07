
class Sample {

int num1;
int num2;

Sample() {
num1 = 10;
num2 = 20;
}

void printValues() {
System.out.println("Num1: " + num1);
System.out.println("Num2: " + num2);
}
}

class NoArgument {

public static void main(String args[]) {

Sample obj = new Sample();
obj.printValues();
}
}
