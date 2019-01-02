class DemoException
{
	public static void main(String args[])
	{
	try
	{
		int i=10,j=0,result;
		result=i/j;
		System.out.println(result);
		try
		{
			int a[]={2,3,4};
			a[5]=12;
			System.out.println(a[5]);
		}
		catch(ArithmeticException ae)
		{
			ae.printStackTrace();
		}
	}
	catch(Exception obj)
	{
		System.out.println(obj);
	}
	catch(ArrayIndexOutOfBoundsException aie)
	{
	aie.printStackTrace();
	}
	}	
}
