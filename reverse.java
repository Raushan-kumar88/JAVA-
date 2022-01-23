import java.util.*;
public class reverse {
    public static void main(String[] args) {    
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of arrays :");
    int size=sc.nextInt();
    int[] arr=new int[size];
    int low=0;
    int high=arr.length-1;
    System.out.println("enter the element = ");
    for (int i = 0; i < arr.length; i++) {
        arr[i]=sc.nextInt();
    }
    System.out.println("Before reverse arrays [] : "+Arrays.toString(arr));
    while(low<high)
    {
        int temp=arr[low];
        arr[low]=arr[high];
        arr[high]=temp;
        high--;
        low++;
    }
        System.out.println("after reverse arrays [] : "+Arrays.toString(arr));
    }
}
