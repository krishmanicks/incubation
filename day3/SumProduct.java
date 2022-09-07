import java.util.*;

class AddProd {

int num;

public void getNum(int x) {
num = x;
}

public int SumDigits() {
int sums = 0;
int n = num;
while (n > 0) {
int rem = n%10;
sums = sums + rem;
n = n/10;
}
return sums;
}

public int ProdDigits() {
int prod = 1;
int n = num;
while (n > 0) {
int rem = n%10;
prod = prod * rem;
n = n/10;
}
return prod;
}

}

class SumProduct {

public static void main(String[] s) {

AddProd sum = new AddProd();
int n;

Scanner sc = new Scanner(System.in);

System.out.print("Enter a positive integer number: ");
n = sc.nextInt();

sum.getNum(n);
System.out.println("sum of all digits are: " + sum.SumDigits());
System.out.println("Product of all digits are: " + sum.ProdDigits());

}
}
