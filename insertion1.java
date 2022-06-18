import java.util.*;
class Insertion
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of Array :");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("enter the element :");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		int temp , j;
		for(int i=1;i<size;i++)
		{
			temp=arr[i];
			j=i;
			while(j>0 && arr[j-1]>temp)
			{
				arr[j]=arr[j-1];
				j=j-1;
			}
			arr[j]=temp;
		}
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}