class circle
{
	void circle(int r)
	{
		
		double pi=3.142;
		double result=pi*r*r;
		System.out.println("area of circle:"+result);
	}
	public static void main(String[] args) 
	{

		new circle().circle(5);

	}
}






