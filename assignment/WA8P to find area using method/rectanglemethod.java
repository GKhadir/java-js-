class rectanglemethod
{
	static void rec(int width,
		int height)
	{
		
		int result=width*height;
		System.out.println("area of rectangle:"+result);
	}
	public static void main(String[] args) 
	{
		System.out.println("*******main starts******");
		rec(5,6);
		System.out.println("*******main ends******");
	}
}
