import java.util.*;

class Digits {

int num;

public void getNum(int x) {
num = x;
}

public int countDigits() {
int count;
count = 0;
while (num > 0) {
num /= 10;
count++;
}
return count;
}
}

class Number {

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
