import java.util.*;
/*
public class today {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int arr[][]={{1,2,3},{5,7,8}};
        int[] arr = new int[5];
        System.out.println("enter element = ");
        for (int i = 0; i < 5; i++) {
            int n=sc.nextInt();
            arr[i]=n;
        }
        for (int i = 0; i < 5; i++) 
        {  
            System.out.print(arr[i] + " ");   
        }
        System.out.println();
        int i;
        // System.out.println("which ele to be search ");
        System.out.println("which ele to be delete ");
        int ele=sc.nextInt();
        for (i = 0; i < arr.length; i++) {
            if (arr[i]==ele) 
            {
                // System.out.println(arr[i] + "  found at  "+i);
                for (int j =i; j <4; j++) {
                    arr[j]=arr[j+1];
                  
                }
               
            } 
            
        }
        for (int k = 0; k < arr.length; k++) 
        {  
            System.out.print(arr[k] + " ");   
        }
        
    }

}
*/
 class demo{
	
	public static void main(String[] args){
		double sum=0;
		Scanner sc = new Scanner(System.in);
		double n= sc.nextDouble();
		for(int i=1;i<=n;i++)
		{
			sum = sum+i;
			
		}
		System.out.println(sum);
	}
	
}

