import java.util.*;
class Tri3
{
	public static void main(String args[])
	{
	int i,j,n=1,r;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the rows:");
	r=s.nextInt();
	for(i=0;i<=r;i++)
	{
		for(j=0;j<=i;j++)
		{
		System.out.print(n+" ");
		n++;
		}
		System.out.println(" ");
	}
	}
}

/*
1
23
456
78910
1112131415
*/