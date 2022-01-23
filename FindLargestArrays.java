import java.util.*;

// import javax.sound.sampled.SourceDataLine;
public class FindLargestArrays {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Raushan kumar"); 
        System.out.println("enter the size of arrays....");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("enter the element.....");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int lar1=arr[0];
        int lar2=arr[1];
        if (lar1<lar2) 
        {
            int temp=lar1;
            lar1=lar2;
            lar2=temp;  
        }  
        System.out.println("the given Arrays [] ="+Arrays.toString(arr));
        for (int i = 2; i < arr.length; i++) 
        {
            if (arr[i]>lar1) {
                lar2=lar1;
                lar1=arr[i];
                
            }
            else if (arr[i]>lar2 && arr[i]!=lar1) {
                lar2=arr[i];
                
            }
        }
        System.out.println("largest first element is "+lar1);
        System.out.println("largest second element is "+lar2);   
     }

    
}
