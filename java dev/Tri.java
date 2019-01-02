import java.util.*;
class Tri
{
	public static void main(String args[])
	{
		int r;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of rows:");
		r=s.nextInt();
		int i,j;
		for(i=1;i<=r;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println(" ");
		}
	}
}
/*
1
12
123
1234
12345
*/			