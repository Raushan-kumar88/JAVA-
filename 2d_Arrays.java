import java.util.*;
class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("enter size of row :");
		int r=sc.nextInt();
		System.out.println("enter size of column :");
		int c=sc.nextInt();
		int[][] arr=new int[r][c];
		for(int i=0;i<r;i++)
		{
		    System.out.println("enter the element :");
		    for(int j=0;j<c;j++)
		    {
		        arr[i][j]=sc.nextInt();
		    }
		    System.out.println(" next row :");
		}
		System.out.println("Arrays element are :");
		for(int i=0;i<r;i++)
		{
		    for(int j=0;j<c;j++)
		    {
		        System.out.print(arr[i][j]+" ");
		        
		    }
		    System.out.println();
		}
		
	    System.out.println("enter the element to be search :");
	    int element=sc.nextInt();
		for(int i=0;i<r;i++)
		{
		    for(int j=0;j<c;j++)
		    {
		        if(arr[i][j]==element)
		        {
		            System.out.println(element + " to found at :( "+ i +","+ j +" )");
		        }
		    }
		    
		}
		
	}
}
