class greater 
{
	public static void main(String[] args) 
	{
		int a=29;
		int b=50;
		double c=50.5;
		int d=5;
		if(a>b && a>c && a>d)
		{
			System.out.println(a+"is greater");
		}
		else if(b>c && b>d)
		{
			System.out.println(b+"is greater");
		}
		else if(c>d)
		{
			System.out.println(c+"is greater");
		}
		else
		{
			System.out.println(5+"is greater");
		}
	}
}
