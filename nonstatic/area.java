class circle
{
	double circle(int r)
	{
		
		double pi=3.142;
		double result=pi*r*r;
		return result;
	}
}
class ellipsemethod
{
	double elli(int a,int b)
	{
		
		double pi=3.142;
		
		double result=pi*a*b;
		return result;
	}
}
class parallelogrammethod
{
	double para(int base,int height)
	{

		double result=base*height;
		return result;
	}
}
class rectanglemethod
{
	int rec(int width,int height)
	{
		
		int result=width*height;
		return result;
	}
}
class sectormethod
{
	double sec(double t,int r)
	{
	
		double result=.05*r*r*t;
		return result;
	}
}
class squaremethod
{
	int  squ(int area)
	{
		
		int result=area*area;
		return result;
	}
}
class tarpezoidmethod
{
	 double tar(int a,int b,int height)
	{
		
		double result=0.5*(a+b)*height;
		return result;
	}
}
class triangle 
{
	 double tri(int base,int height)
	{
		
		double result=0.5*base*height;
		return result;
	}
}
class area
{
	public static void main(String[]args)
	{
		double a=new circle().circle(5);
		System.out.println(a);
		double b=new ellipsemethod().elli(5,6);
		System.out.println(b);
		double c=new tarpezoidmethod().tar(5,6,7);
		System.out.println(c);
		double d=new triangle().tri(5,6);
		System.out.println(d);
		int e=new squaremethod().squ(5);
		System.out.println(e);
		double f=new sectormethod().sec(5,6);
		System.out.println(f);
		int g=new rectanglemethod().rec(5,7);
		System.out.println(g);
		double h=new parallelogrammethod().para(5,6);
		System.out.println(h);

	}
}
