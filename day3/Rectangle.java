import java.util.*;

abstract class Rectangle {
	
	int length,breadth;
	Scanner sc = new Scanner(System.in);
	public abstract void setDim();
	public abstract void getArea();
	
}

class Area extends Rectangle {
	
	public void setDim() {
		System.out.println("Enter length and breadth: ");
		length = sc.nextInt();
		breadth = sc.nextInt();
	}
	
	public void getArea() {
		return length*breadth;
	}
}

class A {
	
	public static void main(String args[]) {
		Area a = new Area();
		a.setDim();
		a.getArea();
	}
}

