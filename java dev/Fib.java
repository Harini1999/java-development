import java.util.*;
class Fib
{
	public static void main(String args[])
	{
	int n,t1=-1,t2=1;
 	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number of terms:");
	n=s.nextInt();
	System.out.println("terms:"+n);
	System.out.println("The series are:");
	for(int i=1;i<=n;i++)
	{
		int sum=t1+t2;
		t1=t2;
		t2=sum;
		System.out.println(t2);
	}
	}
}