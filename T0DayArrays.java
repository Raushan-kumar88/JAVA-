import java.util.*;
public class T0DayArrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of Row....");   //create 2d arrays and initialize
        int row =sc.nextInt();
        System.out.println("enter the length of column....");
        int column=sc.nextInt();
        int[][] arr=new int[row][column];
        System.out.println("enter the element....");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j]=sc.nextInt();
            }
            System.out.println("next column...");
        }
        System.out.println("arrays [][] = "+Arrays.toString(arr));
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
