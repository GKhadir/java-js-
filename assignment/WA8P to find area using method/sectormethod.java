class sectormethod
{
	static void sector(double t,int r)
	{
		
		
		
		double result=.05*r*r*t;
		System.out.println("area of sector:"+result);
	}
	public static void main(String[] args) 
	{
		System.out.println("*******main starts******");
		sector(5,9);
		System.out.println("*******main ends******");
	}
}


