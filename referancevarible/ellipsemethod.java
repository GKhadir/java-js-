class ellipsemethod
{
	void elli(int a,int b)
	{
		
		double pi=3.142;
		
		double result=pi*a*b;
		System.out.println("area of ellipse:"+result);
	}
	public static void main(String[] args) 
	{

		ellipsemethod ell1=new ellipsemethod();
		ell1.elli(5,5);
	}
}
