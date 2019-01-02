import java.util.*;
class Tri4
{
	public static void main(String args[])
	{
		int r;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of rows:");
		r=s.nextInt();
		int i,j;
		for(i=r;i>=1;i--)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println(" ");
		}
	}
}
			