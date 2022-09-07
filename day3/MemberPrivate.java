
class Privates {
private int num1 = 10;
private int num2 = 20;

void printValues() {
System.out.printf("Num1: %d\n", num1);
System.out.printf("Num2: %d\n", num2);
}
}
public class MemberPrivate {

public static void main(String[] args) {
Privates pri = new Privates();

pri.printValues();

}
}
