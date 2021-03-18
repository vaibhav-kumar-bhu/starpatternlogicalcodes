import java.util.Scanner;
// The time complexity of this algo is NlogN
class sorts
{
	// This will create partition for the array using pivotal point
	public static  int partition(int arr[],int l,int h)
	{
		int i=l;
		int pivot=arr[l];
		int j=h;
		while(i<=j)
		{
			while(arr[i]<=pivot)
			{
				i++;
			}
			while(arr[j]>pivot)
			{
				j--;
			}
			if(i<=j)
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
		}
		int temp=arr[l];
		arr[l]=arr[j];
		arr[j]=temp;
		return j;

	}
	// This will apply quicksort recursively
	public static void quick(int arr[],int l,int h)
	{

		if(l<h)
		{
			int pi=partition(arr,l,h);
			quick(arr,l,pi-1);
			quick(arr,pi+1,h);

		}
	}
	// This will print the sorted arrays
	public static void display(int arr[],int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}

	}
}

class quicksort
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();
		System.out.println();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();

		}
		System.out.println("sorted array are");
		sorts s=new sorts();
		s.quick(arr,0,n-1);
		s.display(arr,n);


	}
}