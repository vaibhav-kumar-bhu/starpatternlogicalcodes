import java.util.Scanner;
class pattern2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}
}