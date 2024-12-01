class loop 
{
	public static void main(String[] args) 
	{
		int num=10;
		int k= 5;
		for(int i=2;i<5;i++)
		{
			if(num%i==0)
			{
				k=4;
			}
		}
		if(k==5)
		{
			System.out.println(num+"is prime number");
		}
		else
		{
			System.out.println(num+"is not prime number");
		}
	
	}	
}
