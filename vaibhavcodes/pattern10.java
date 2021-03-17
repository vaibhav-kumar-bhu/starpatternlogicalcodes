import java.util.Scanner;
class pattern10
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbr of rows");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k<n;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}