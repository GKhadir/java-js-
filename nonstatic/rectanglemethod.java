class rectanglemethod
{
	void rec(int width,int height)
	{
		
		int result=width*height;
		System.out.println("area of rectangle:"+result);
	}
	public static void main(String[] args) 
	{

		new rectanglemethod().rec(5,6);

	}
}

