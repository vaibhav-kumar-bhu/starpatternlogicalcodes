import java.util.Scanner;
class sorts
{
	public  void merge( int arr[],int n,int l,int mid,int h)
	{
		 int aux[]=new int[n];
		
		int i=l;
		int j=mid+1;
		int k=l;
		while(i<=mid && j<=h)
		{
			if(arr[i]<=arr[j])
			{
				aux[k++]=arr[i++];

			}
			else
			{
				aux[k++]=arr[j++];
			}
			
		}
		while(i<=mid)
		{
			aux[k++]=arr[i++];
		}
		while(j<=h)
		{
			aux[k++]=arr[j++];
		}
		
		for(int m=l;m<=h;m++)

		{
			arr[m]=aux[m];
		}


	}
	public  void mergesort( int arr[],int n,int l,int h)
	{
		int mid;
		if(l<h)
		{
			mid=l+(h-l)/2;
			mergesort(arr,n,l,mid);
			mergesort(arr,n,mid+1,h);
			merge(arr,n,l,mid,h);
		}
	}
	 public void display( int arr[],int n)

	{
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}

	}
}
class sorting
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	    System.out.print("Enter the number of elements");
		int p=sc.nextInt();

		int arr[]=new int[p];
		System.out.println();
		for(int i=0;i<p;i++)
		{
			arr[i]=sc.nextInt();
		}
		int n=arr.length;
		System.out.println();
		sorts s=new sorts();
		s.mergesort(arr,n,0,n-1);
		System.out.println("sorted array are :");

		s.display(arr,n);


	}
}