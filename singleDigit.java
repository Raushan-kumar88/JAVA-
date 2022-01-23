import java.util.*;
public class singleDigit {
    public static void main(String[] args)
	{
        Scanner sc=new Scanner(System.in);
        int ans=1;
        System.out.println("enter the number between 0 to 9");
        int n=sc.nextInt();
        
       switch(n)
        {
            case 0:
            System.out.println("Zero");
            break;
            case 1:
            System.out.println("First");
            break;
            case 2:
            System.out.println("two");
            break;
            case 3:
            System.out.println("Three");
            break;
            case 4:
            System.out.println("four");
            break;
            case 5:
            System.out.println("five");
            break;
            case 7:
            System.out.println("Seven");
            break;
            case 8:
            System.out.println("eight");
            break;
            case 9:
            System.out.println("Nine");
            break;
            default :
            System.out.println("invalid number");
            break;
        }
for(int i=1;i<=n;i++)
{
    ans=ans*i;
}
System.out.println("Factorial of "+n+" is "+ans);
/*int a=6,b=0,c;
try
{
    c=a/b;
    System.out.println(c);

}
catch(ArithematicException e)
{
    System.out.println(e);
}
finally
{
    System.out.println("I am finally block");
}*/
    }
	
    
}
