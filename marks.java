import java.util.*;
/*class student
{
String name;
int marks;
float percentage;
void insert(String n,int m,float p)
{
	name=n;
	marks=m;
	percentage=p;
}
void display()
{
	System.out.println("your name is "+name);
	System.out.println("your marks is "+marks);
	System.out.println("your percentage is "+percentage);

}	
}
class A
{
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name :-");
		String n=sc.nextLine();
		System.out.println("enter the maths marks:-");
		int m=sc.nextInt();
		System.out.println("enter the english marks:-");
		int e=sc.nextInt();
		System.out.println("enter the physics marks:-");
		int p=sc.nextInt();
		System.out.println("enter the hindi marks:-");
		int h=sc.nextInt();
		System.out.println("enter the chemistry marks:-");
		int c=sc.nextInt();
		
		int total=(m+c+p+e+h);
		float per=total/5;
		student obj=new student();
		obj.insert(n,total,per);
		obj.display();
	}
}*/
//Write a program to find simple interest.
/*import java.util.*;

class interest
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the principal=");
		double p=sc.nextDouble();
		System.out.println("enter the rate=");
		double r=sc.nextDouble();
		System.out.println("enter the time=");
		double t=sc.nextDouble();
		double total=(p*r*t)/100;
		System.out.println("Your total interest is = "+total);
	}
}*/	

//write a java program to perform arthmetic operetion
import java.util.*;
class operation
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your first number=");
		int a=sc.nextInt();
		System.out.println("enter your second number=");
		int b=sc.nextInt();
		int sum=a+b;
		int sub=a-b;
		int mult=a*b;
		float div=a/b;
		System.out.println("sum="+sum);
		System.out.println("substration="+sub);
		System.out.println("multiply="+mult);
		System.out.println("division="+div);
	}
}
