//import java.util.*;
/*class exam1
{
	static int a=0,b=1,t;
    void main(int n)
    {
        if(n>=1)
        {
            t=a+b;
            System.out.format("%4d",t);
            a=b;
            b=t;
            main(n-1);
        }
        
    }
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		/*System.out.println("Enter any number = ");
		int n=sc.nextInt();
		System.out.println("Enter any number between (0 to 9) = ");
		int n1=sc.nextInt();
		if(n%2==0)
			System.out.println(n + " is even");
		else
			System.out.println(n + " is odd");
		switch(n1)
		{
			case 0:
            System.out.println("Zero");
		    break;
			case 1:
            System.out.println("One");
		    break;
			case 2:
            System.out.println("Two");
		    break;
			case 3:
            System.out.println("Three");
		    break;
			case 4:
            System.out.println("Four");
		    break;
			case 5:
            System.out.println("Five");
		    break;
			case 6:
            System.out.println("Six");
		    break;
			case 7:
            System.out.println("Seven");
		    break;
			case 8:
            System.out.println("Eight");
		    break;
			case 9:
            System.out.println("Nine");
		    break;
		    default:
		    System.out.println("Invalid number");
		    break;
		}
		
		//---------------next program-----------------
		System.out.println("Enter first number = ");
		int n2=sc.nextInt();
		System.out.println("Enter first number = ");
		int n3=sc.nextInt();
		System.out.println("Enter operator (+,-,*,/,%)=");
		char operator=sc.next().charAt(0);
		switch(operator)
		{
			case '+':
			System.out.println("Sum = "+ (n2+n3));
			break;
			case '-':
			System.out.println("Sub = "+ (n2-n3));
			break;
			case '*':
			System.out.println("Multiplication = "+ (n2*n3));
			break;
			case '/':
			System.out.println("Division = "+ (n2/n3));
			break;
			case '%':
			System.out.println("Modulus = "+ (n2%n3));
			break;
			default:
			System.out.println("Invalid number.......");
			break;
		}
		
		//----------------next Program--------------
		int n1=0,n2=1,temp;
		System.out.print(n1+" "+n2+" ");
		for(int i=1;i<=10;i++)
		{
			temp=n1+n2;
			System.out.print(temp + " ");
			n1=n2;
			n2=temp;
		}
		
		//-----------next Program--------------
		 
	
		
		System.out.println("Enter any number = ");
		int n=sc.nextInt();
		System.out.print(a+"  "+b+"");
		exam1 obj=new exam1();
		obj.main(n);
		
		//------------next Program--------------
		int count=0;
		System.out.println("enter any number = ");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				
				count++;
			}
		}
		if(count==2 || count==1)
		{
			System.out.println(num+" is prime number...."+ "total prime number = " + count);
		}
		else
		{
			System.out.println(num+" not prime....");
		}
		
		
			
	}
}
----------------program of constructor--------------

class A
{
	int side1,side2,side3;
	A(int a,int b,int c)
	{
		side1=a;
		side2=b;
		side3=c;
		
	}
	void display()
	{
		float p=side1+side2+side3;
		double s =(side1+side2+side3)/2; // Perimeter/2
		double area=Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		System.out.println("the perimeter of triangle = "+p);
		
		System.out.println("area of triangle = "+area);
		
	}
}
class demo
{
	public static void main(String[] args)
	{

		A obj=new A(4,8,6);
		obj.display();
	}
}
//-----------next program ----------------
import java.io.*;
class filecopy
{
	public static void main(String[] args)
	{
		int i;
		try
		{	
		    FileInputStream r=new FileInputStream("C:\\Users\\RAUSHAN KUMAR\\Desktop\\good.txt");
		    FileOutputStream w=new FileOutputStream("C:\\Users\\RAUSHAN KUMAR\\Desktop\\bad.txt");
			while((i=r.read())!=-1)
			{
				w.write((char)i);
			}
			System.out.println("Write is successsfully written");
		}
		catch(IOException e)
		{
			System.out.println("Exception is handling......");
		}
	}
}
//-----------next program -------------
 
import java.io.*;
class OutDisplay
{
	public static void main(String[] args)
	{
		
		try
		{
			FileReader fr=new FileReader("C:\\Users\\RAUSHAN KUMAR\\Desktop\\good.txt");
			//FileWriter wr=new FileWriter("C:\\Users\\RAUSHAN KUMAR\\Desktop\\good.txt");
			try
			{
				int i;
				while((i=fr.read())!=-1)
				{
				System.out.print((char)i);	
				}
			}
			finally
			{
				fr.close();
			}
			
		}
		catch(IOException e)
		{
			System.out.println("Exception is handling ......");
		}
	}
}


class L_arrray
{
	public static void main(String[] args)
	{
		int [] ar={99,3,5,6,7,8,9};
		System.out.println(ar[3]);
		Arrays.sort(ar);
		System.out.println(ar[3]);
	}
}

//----------------next program-Overloading--------------------------------
class demo1
{
	void demo(int i,String n)
	{
		System.out.println("I am first class Methhod 1.....");
	}
	void demo(int i)
	{
		System.out.println("i am second method 2.........");
	}
}
class OverLoading
{
	public static void main(String[] args)
	{
		demo1 obj=new demo1();
		obj.demo(10,"Raushan kumar");
		obj.demo(20);
	}
}

class demo1
{
	void display(String p,int n)
	{
		System.out.println("I am first class .....");
	}
	
}
class demo2 extends demo1
{
	void display(String p,int n)
	{
		System.out.println("I am second class.......");
	}
}
class overRidding
{
	public static void main(String[] args)
	{
		demo1 obj1=new demo1();
		obj1.display("Raushan",10);
		demo2 obj2 = new demo2();
		obj2.display("Kumar",24);
	}
}

//-----------next program-OverRidding-----------------------------------------
class marks
{
	String name;
	int marks;
	marks(String n,int m)
	{
		name=n;
		marks=m;
		
	}
	void display()
	{
		System.out.println("name : "+name+"\n marks : " +marks);
	}
}
class constructorP
{
	public static void main(String[] args)
	{
		marks obj=new marks("Raushan",125);
		obj.display();
	}
}
//----------------------next program-----------------

import java.util.*;
class stringtoken
{
	public static void main(String[] args)
	{
		StringTokenizer sr=new StringTokenizer("I am raushan kumar ");
		while(sr.hasMoreTokens())
		{
			System.out.println(sr.nextToken());
		}
		Calendar c=Calendar.getInstance();
		int mr=c.getMaximum(Calendar.WEEK_OF_YEAR);
		System.out.println("current Year = "+c.get(Calendar.YEAR));
		System.out.println("total weak of year = "+mr);
		Random r=new Random();
		System.out.println(r.nextInt(10));
		
	}
	
}
*/
import java.util.*;
class primeONot
{
	public static void main(String[] args)
	{
		int sr=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number = ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				sr++;
			}
		}
		if(sr==2||sr==1)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not prime");
		}
	}
	
}