import java.util.*;

abstract class Rectangle {
	
	int length,breadth,height;
	Scanner sc = new Scanner(System.in);
	public abstract void setDim();
	public abstract int getArea();
	
}

class Area extends Rectangle {
	
	public void setDim() {
		System.out.println("Enter length and breadth: ");
		length = sc.nextInt();
		breadth = sc.nextInt();
	}
	
	public int getArea() {
		return length*height;
	}
}

class Rec {
	
	public static void main(String args[]) {
		Area a = new Area();
		a.setDim();
		System.out.println(a.getArea());
	}
}

