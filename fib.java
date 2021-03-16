import java.util.Scanner;
class fib
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number from where you want to print");
		int n=sc.nextInt();
		int x=0;
		int y=1;
		int z;
		System.out.println(x);
			System.out.println(y);
		for(int i=2;i<n;i++)
		{
			z=x+y;
			System.out.println(z);
			x=y;
			y=z;
			
		}
	}
}