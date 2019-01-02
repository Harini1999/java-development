class DemoException1
{
	public static void main(String args[])
	{
	try
	{
		int i=10,j=10,result;
		result=i/j;
		System.out.println(result);
		try
		{
			int a[]={2,3,4};
			a[5]=12;
			System.out.println(a[5]);
		}
		catch(Exception obj)
		{
		System.out.println(obj);
		}
	}
	catch(ArithmeticException ae)
	{
		ae.printStackTrace();
	}
	
	
	}		
}
