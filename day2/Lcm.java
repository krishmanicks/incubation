import java.util.*;

class Lcm {
	
public static void main(String[] args) {

int n1 = 3, n2 = 21, gcd = 1;

for(int i = 1; i <= n1 && i <= n2; ++i) {

if(n1 % i == 0 && n2 % i == 0)
gcd = i;
}

int lcm = (n1 * n2) / gcd;
System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
}
}
