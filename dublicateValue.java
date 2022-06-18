import java.util.*;			//Brute first method
class demo
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Arrays : ");
		int size=sc.nextInt();
		int[] arr=new int[size];		//arrays create
		System.out.println("Enter the element : ");
		for(int i=0;i<arr.length;i++)
		{								//arrays initialize
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)		
			{
				if(arr[i]==arr[j])
				{									//to find dublicate value
					System.out.print(arr[i]+" ");
				}
			}
			
		}
		
	}
}