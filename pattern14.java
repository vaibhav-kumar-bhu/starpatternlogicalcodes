import java.util.Scanner;
class pattern14
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=n-1;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print("*");
			}
			for(int l=1;l<=i;l++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=n-1;k>i;k--)
			{
				System.out.print("*");
			}
			for(int l=n;l>i;l--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

	
