import java.util.*;
public class demo3 
{
    static int a=0,b=1,c;
    void main(int i)
    {
        if(i>=1)
        {
            c=a+b;
            System.out.format("%4d",c);
            a=b;
            b=c;
            main(i-1);
        }
    }             // fibonasic series using recursion 
    public static void main(String[] args)
    {
        System.out.println("Fibonasic series program:-");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of f :-");
        int f=sc.nextInt();
        System.out.print(a + "  "+ b);
        demo3 obj=new demo3();
        obj.main(f);

        //System.out.println("the value of f :-" +f);
        //demo3 obj=new demo3();



    }
 
    
}
