
class AnonymousObject {
int a;

AnonymousObject(int p) {
	a = p;
}

AnonymousObject() {
	System.out.println("object created");
}


void area() {
  int area = a * a;
  System.out.println("Area of square: " +area);
}
void perimeter(int b) {
  int peri = 4 * b;
  System.out.println("Perimeter of square: " +peri);
} 

public static void main(String[] args)  {
	new AnonymousObject();
   new AnonymousObject(10).area();
   new AnonymousObject(20).perimeter(100);
}
}