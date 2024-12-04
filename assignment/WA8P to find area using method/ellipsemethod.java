class ellipsemethod
{
	static void elli(int a,int b)
	{
		
		double pi=3.142;
		
		double result=pi*a*b;
		System.out.println("area of ellipse:"+result);
	}
	public static void main(String[] args) 
	{
		System.out.println("*******main starts******");
		elli(5,5);
		System.out.println("*******main ends******");
	}
}
