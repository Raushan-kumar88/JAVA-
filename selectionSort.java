import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array = ");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("enter element = ");
		for(int i=0;i<arr.length;i++)
		{
		    arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
		    int flag=0;
		    for(int j=0;j<arr.length-1-i;j++)
		    {
		        if(arr[j]>arr[j+1])
		        {
		            int temp=arr[j];
		            arr[j]=arr[j+1];
		            arr[j+1]=temp;
		            flag=1;
		        }
		    }
		    if(flag==0)
		    {
		        break;
		    }
		}
	    for(int i=0;i<arr.length;i++)
	    {
	       System.out.print(arr[i]+" ");
	    }
	}
}