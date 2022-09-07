class Add
{ 
int a;
int b;

Add(int x,int y)
{
a = x;
b = y;
}
void sum(Add A1)
{ 
int sum1 = A1.a + A1.b;
System.out.println("Sum of a and b :" + sum1);
}
}

class ObjectAsParam
{
public static void main(String args[])
{ 
Add A = new Add(5,8);
A.sum(A);
}
}
