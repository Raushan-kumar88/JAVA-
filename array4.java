import java.util.*;
public class array4 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
System.out.println("Linear search .......");

System.out.println("enter the sige of array ...");
int n=sc.nextInt();
int[] arr = new int[n];
System.out.println("enter the element...");
for (int i = 0; i < arr.length; i++) {
    arr[i]=sc.nextInt();
}
System.out.println("which element to be search ......");
int se=sc.nextInt();
for (int k = 0; k < arr.length; k++) {
    if (arr[k]==se) {
        System.out.println("element is found at " + k);
    }
}
System.out.println("which element to be delete .....");
int de=sc.nextInt();
for (int j = 0; j < arr.length ; j++) {
    if (arr[j] == de) {
        for(int k = j ; k<arr.length-1 ; k++)
        {
            arr[k]=arr[k+1];
        }
        break;
    }
}
for (int i = 0; i < arr.length-1; i++) {
    System.out.print(arr[i]+" ");
}
}    
}
