// class Area {
	// int area;
	
	// Area(int area) {
		// this.area = area;
	// }
	
	// public void showArea();
// }

class Circle {
	double rad;
	Circle(double rad) {
		this.rad = rad;	
	}
	double getArea() {
		return (22.0/7.0) * rad * rad;
	}
}

class Rec {
	double len;
	double bre;
	Rec(double len, double bre) {
		this.len = len;
		this.bre = bre;
	}
	double getArea() {
		return len*bre;
	}
	
}


class calArea {
	public static void main(String args[]) {
		Circle c = new Circle(5);
		Rec r = new Rec(6,5);
		System.out.println("circle - " + c.getArea());
		System.out.println("Rectangle - " + r.getArea());
	}
}