import java.util.*;

class HappyNumber  
{     
static int isHappy(int num){  
int rem = 0, sum = 0;  

while(num > 0) {
rem = num%10;  
System.out.print(rem+"^2");
sum = sum + (rem*rem);  
num = num/10;
if(num > 0)
System.out.print(" + ");
}
System.out.print(" = " + sum);
System.out.println();

return sum;  
}  

public static void main(String args[]) {
int num = 82;
int res = num;

while(res != 1 && res != 4) {
res = isHappy(res);
}
 
if(res == 1)  
System.out.println(num + " is a happy number");  
else if(res == 4)  
System.out.println(num + " is not a happy number");     
}  
} 