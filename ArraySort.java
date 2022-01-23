import java.util.*;
public class ArraySort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Raushan kumar");
        // System.out.println("accessending order sorting.....");
        System.out.println("enter the size of array....");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("enter the element ..");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
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
        System.out.print("sorted array Accessding order [] : " + Arrays.toString(arr));
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]<arr[j]) {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }            
            }
        }
        
        System.out.print("sorted array Deccessiding order [] : " + Arrays.toString(arr));
        /*
        Arrays.sort(arr);
        System.out.printf("sorted array [] = %s ",Arrays.toString(arr));
*/
        }
}
