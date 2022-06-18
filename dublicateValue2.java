import java.util.*;
import java.util.Set;				//by using hash interface.....
import java.util.HashSet;
class demo
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of arrays : ");
		int size=sc.nextInt();
		int[] arr=new int[size];			//Arrays create
		System.out.println("enter the element : ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();		//Arrays intilize
			
		}
		Set<Integer> s=new HashSet<>();
		int count=0;
		for(int no:arr)
		{	
			boolean b=s.add(no);
			if(b==false)
			{
				System.out.print(no+" ");
				count +=1;
			}
			
			
		}
		if(count==0)
		{
			System.out.println("No element is dublicated .....");
		}
		
	}
}