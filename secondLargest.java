/*import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of Arrays : ");
		int size=sc.nextInt();
		int[] arr=new int[size];                // here to inisilize an arrays  
		System.out.println("enter the element : ");
		for(int i=0;i<arr.length;i++)
		{
		    arr[i]=sc.nextInt();
		}
		
		int temp=0,temp1;
		
		int max=arr[0];
		int min=arr[0];                             //here to find minimum element
		for(int i=1;i<arr.length;i++)
		{
		    if(arr[i]<min)
		    {
		        min=arr[i];
		    }
		}
		System.out.println("minimum element is :"+min);
		for(int i=1;i<arr.length;i++)
		{
		    if(arr[i]>max)
		    {
		        max=arr[i];                     //here to find largest element in arrays
		    }
		}
		System.out.println("the maximum element in arrays is : "+max);
		for(int i=0;i<arr.length;i++)
		{
		    
		   for(int j=i+1;j<arr.length;j++)
		   { 
		    if(arr[i]>arr[j])
		    {                           //here to shorted in accessending form 
		        temp1=arr[i];
		        arr[i]=arr[j];
		        arr[j]=temp1;
		    }
		    
		    }
		   /* if(i==1)
		    {
		        break; // this method to be use when print second smallest element.
		    }*/
		/*}
		
		System.out.println("the sorted arrays [] :"+Arrays.toString(arr));
		System.out.println("enter the element to be search : ");
		int ele=sc.nextInt();
		for(int i=0;i<arr.length;i++)
		{
		    if(arr[i]==ele)
		    {                               //to searching any element in arrays
		        System.out.println("element is found at : "+ i);
		         temp +=1;
		    }
		}
	 
	    if(temp == 0)
		{
		    System.out.println(ele + " element to be search is not present in arrays : ");
		}
	}
}
*/

class Main
{
	public static void main(String[] args) {
		
		int[] arr={2,9,3,8,1};
	/*	for(int i=0;i<arr.length;i++)
		{
		    for(int j=i+1;j<arr.length;j++)
		    {
		        if(arr[i]<arr[j])
		        {                           //first method to find second largest element in arrays.
		            int temp=arr[i];
		            arr[i]=arr[j];
		            arr[j]=temp;
		        }
		    }
		    if(i==1)
		    {
		        break;
		    }
		}
		System.out.println("second largest element is : "+arr[1]);
		for(int i=0;i<arr.length;i++)
		{
		   System.out.print(arr[i]+" ");
		}*/
		int largest=Integer.MIN_VALUE;
		int second_largest=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
		    if(arr[i]>largest)
		    {
		        second_largest=largest;
		        largest=arr[i];             //second method to find second largest element in arrays.
		    }
		    else if(arr[i]>second_largest && arr[i]!=largest)
		    {
		        second_largest=arr[i];
		    }
		}
		    if(second_largest==Integer.MIN_VALUE)
		    {
		        System.out.print("no second largest element in arrays ");
		    }
		    else
		    {
		        System.out.print("second largest element in arrays : "+second_largest);
		    }
		
	}
}
