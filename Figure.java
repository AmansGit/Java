class Area
{
	void ac(int a)
	{
		System.out.println("area of the cube "+(6*a*a));
	}
	void ac(float d)
	{
		System.out.println("area of square " +(d*d));
	}
	void ac(double c)
	{
		System.out.println("area of sphere " +(4*(3.14)*c*c));
	}
}
class Figure
{
	public static void main(String args[])
	{
		Area ob=new Area();
		ob.ac(3.2);
		ob.ac(3.25f);
		ob.ac(9);
	}
}
		