
class Box
{
	double width, height, depth;

	Box(double w, double h, double d)
	{
		width = w;
		height = h;
		depth = d;
	}

	Box()
	{
		width = height = depth = 0;
	}

	Box(double len)
	{
		width = height = depth = len;
	}

	double volume()
	{
		return width * height * depth;
	}
}

class constOverloading
{
	public static void main(String args[])
	{
		Box mybox1 = new Box(10, 20, 15);
		Box mybox2 = new Box();
		Box mycube = new Box(7);

		System.out.println(" Volume of mybox1 is " + mybox1.volume());

		System.out.println(" Volume of mybox2 is " + mybox2.volume());
		
		System.out.println(" Volume of mycube is " + mycube.volume());
	}
}
