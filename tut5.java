import java.util.*;
class T
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Raushan kumar");
		/*int a=5,b=0,c;
		c=a/b;
		System.out.println(c);*/
		int ans=0;
		System.out.println("enter any number=");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				ans+=1;
			}
		}
		  if(ans==2 || ans==1)
		     {
			   System.out.println("number is prime");
		     }
		  else
		   {
			   System.out.println("number is not prime");
		   }
		
	   
		
	}
}