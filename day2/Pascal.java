import java.util.*;

public class Pascal {

public static void main(String[] args)
{
int c=1,i,j;
System.out.print("Input number of rows: ");
Scanner in = new Scanner(System.in);
int row = in.nextInt();
for(i=0;i<row;i++)
{
for(int k=1;k<=row-i;k++)
System.out.print(" ");
for(j=0;j<=i;j++)
{
if (j==0||i==0)
	c=1;
else
   c=c*(i-j+1)/j;
System.out.print(" "+c);
}
System.out.print("\n");
}
}
}
