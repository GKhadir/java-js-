class tarpezoidmethod
{
	static void tar(int a,int b,int height)
	{
		
		double result=0.5*(a+b)*height;
		System.out.println("area of tarpezoid:"+result);
	}
	public static void main(String[] args) 
	{
		System.out.println("*******main starts******");
		tar(4,5,6);
		System.out.println("*******main ends******");
	}
}

