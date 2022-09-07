import java.util.*;

class Frog {

public static void main(String args[]) {

int i=30;
int hour = 0;
int temp = 0;
while(temp+3 != i || temp+3 < i) {
if(temp + 3 != 30) {
	hour++;
	}
		temp = temp + 3 - 2;
	}
	System.out.println(hour + " hours");
}
}