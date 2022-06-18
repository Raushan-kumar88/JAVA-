import java.util.*;
public class FindArraysEvenOddElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of arrays...");
        int size=sc.nextInt();
        int[] arr=new int[size];    //Arrays create 
        System.out.println("enter the element....");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();   //arrays initilize is complete

        }
        System.out.println("Even element in arrays....");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0) {
                System.out.println(arr[i]+" ");
            }

        }
        System.out.println("Odd element in arrays....");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2!=0) {
                System.out.println(arr[i]+" ");
            }

        }
        
    }
}
