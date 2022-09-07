import java.util.*;

class Digits {

int num;

public void getNum(int x) {
num = x;
}

public int countDigits() {
int n, count;
n = num;
count = 0;
while (n > 0) {
n /= 10;
count++;
}
return count;
}
}

public class Number {

public static void main(String[] s) {

Digits dig = new Digits();
int n;

Scanner sc = new Scanner(System.in);

System.out.print("Enter a positive integer number: ");
n = sc.nextInt();

dig.getNum(n);
System.out.println("Total number of digits are: " + dig.countDigits());

}
}
