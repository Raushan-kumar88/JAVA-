import java.util.*;
class Arrays_Create
{
    Arrays_Create(int Size)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[Size];
        System.out.println("enter the element ...");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("the given Arrays [] " + Arrays.toString(arr));
    }
}
class Arrays_searching
{
    Arrays_searching(int size)
    {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[size];
        
        System.out.println("enter the element.....");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int low=0;
        int high=arr.length;
        System.out.println("enter the element to be search...");
        int key=sc.nextInt();
        while (low<=high) {
            int mid=(low+high)/2;
            if (mid==key) {
                System.out.println(key +" element is found at " + mid);    
            }
            else if (mid<key) {
                   low=mid+1; 
            }
            else
            {
                high=mid-1;
            }
            
            
        }
    }
}
class Sorting {
    Sorting(int Size) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[Size];
        System.out.println("enter the element ...");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("the given Arrays [] " + Arrays.toString(arr));
        int temp=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]>arr[j]) {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("After sorting Arrays [] " + Arrays.toString(arr));
    }

}

public class ArraysFunction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("enter your choice.................... \n1.Arrays Creating \n2.searching \n3.Sorting \n4.Find Two Largest Element \n5.Reverse \n6.Deleting \n7.Exit");
            int choice=sc.nextInt();
            if(choice==1)
            {
                System.out.println("enter the size of arrays..");
                int s = sc.nextInt();
                Arrays_Create obj= new Arrays_Create(s);
            }
            else if (choice==2) {
                System.out.println("enter the size of arrays..");
                int s = sc.nextInt();
                Arrays_searching obj=new Arrays_searching(s);
            }
            else if (choice==3) {
                System.out.println("enter the size of arrays..");
                int s = sc.nextInt();
                Sorting obj = new Sorting(s);
            }
            else if (choice==4) {
                System.out.println("enter the size of arrays..");
                int s = sc.nextInt();
            }
            
            else if (choice==5) {
                System.out.println("enter the size of arrays..");
                int s = sc.nextInt();
            }
            else if (choice==6) {
                System.out.println("enter the size of arrays..");
                int s = sc.nextInt();
            }
            
            else if (choice==7) {
                System.out.println("enter the size of arrays..");
                int s = sc.nextInt();
            }
            else {
                break;
            }
        }   

    
}

}
