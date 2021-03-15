import java.util.Scanner;
class pattern4
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your numbers");
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

	}
}