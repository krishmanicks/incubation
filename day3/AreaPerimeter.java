import java.util.*;

class AreaandPerimeter {
	
float radius = 0.0f;
float area = 0.0f;
float perimeter = 0.0f;

public void readRadius() {
Scanner sc = new Scanner(System.in);
System.out.print("Enter radius:");
radius = sc.nextFloat(); 
}

public float getArea() {
area = (float)Math.PI*radius*radius;
return area;
}

public float getPerimeter() {
perimeter = 2 * (float)Math.PI * radius;
return perimeter;
}
}
public class circle {
public static void main(String[] s) {
AreaandPerimeter area = new AreaandPerimeter();

area.readRadius();
System.out.println("Area of circle:" + area.getArea());
System.out.println("Perimeter of circle:" + area.getPerimeter());
}
}
