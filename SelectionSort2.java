
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array :");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("enter the element : ");
		for(int i=0;i<arr.length;i++)
		{
		    arr[i]=sc.nextInt();
		}
		int suce,temp=0;
		for(int i=0; i<arr.length;i++)
		{
		    suce=i;
		    for(int j=i+1;j<arr.length;j++)
		    {
		        if(arr[j]<arr[suce])
		        {
		            suce=j;
		        }
		    }
		    temp=arr[i];
		    arr[i]=arr[suce];
		    arr[suce]=temp;
		}
		System.out.println("Array [] : "
                           + Arrays.toString(arr));
		for(int i=0; i<arr.length;i++)
		{
		    System.out.printf("%4d",arr[i]);
		}
	}
}
