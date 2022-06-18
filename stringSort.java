import java.util.*;
class StringSort
{
	public static void main(String[] args)   //bubble short string arrays
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of Arrays : ");
		int size =sc.nextInt();
		String[] arr=new String[size];
		System.out.println("enter the string elements : ");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.next();
		}
		
		/* for(int i=0;i<size;i++)
			{									//this method is bubble shot 
			for(int j=0;j<size-1-i;j++)
			{
				
				if(arr[j].compareTo(arr[j+1])>0)
				{
					String temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}*/
		
		//next method-----------
		for(int i=0;i<arr.length;i++)
		{
			int min=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j].compareTo(arr[min])<0)
				{
					min=j;
				}
			}
			String temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
		
		System.out.println("arrays[] : "+Arrays.toString(arr));
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
			
	}
}