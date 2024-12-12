class sectormethod
{
	void sector(double t,int r)
	{
		
		
		
		double result=.05*r*r*t;
		System.out.println("area of sector:"+result);
	}
	public static void main(String[] args) 
	{

		sectormethod sec1=new sectormethod();
		sec1.sector(5,9);

	}
}


