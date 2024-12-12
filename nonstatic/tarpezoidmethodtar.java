class tarpezoidmethod
{
	 void tar(int a,int b,int height)
	{
		
		double result=0.5*(a+b)*height;
		System.out.println("area of tarpezoid:"+result);
	}
	public static void main(String[] args) 
	{

		new tarpezoidmethod().tar(4,5,6);

	}
}

