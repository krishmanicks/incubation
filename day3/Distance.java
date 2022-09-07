import java.util.*;

class Adding {

public int addDistance(int a, int b) {

return a+b;
}
}

class Distance {

public static void main(String[] s) {

Adding dis = new Adding();
Scanner sc = new Scanner(System.in);

System.out.print("Enter two positive integer number: ");
int n1 = sc.nextInt();
int n2 = sc.nextInt();
System.out.println("Total total distance is : " + dis.addDistance(n1,n2));

}
}
