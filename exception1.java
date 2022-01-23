class fibonasicc
{
	void main(int i)
	{
		System.out.println(" "+c);
		c=a+b;
		a=b;
		b=c;
		main(i-1);
	}
}


class Exception
{
	public static void main(String[] args)
	{
		System.out.println("Hello every-One This program of try catch finally keyword");
		
		 int a=0,b=1,c;
		/*try
		{
			int a=50,b=0,c;
			c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e)
        {
			e.printStackTrace();
			System.out.println(e);
			//System.out.println(e.toString());
			//System.out.println(e.getMessage());

        }
		finally
		{
			System.out.println(" I am finally block");
		}*/
		
		System.out.println("Raushan kumar fibonasicc series:-");
		System.out.println(a+" "+b);
        fibonasicc obj=new fibonasicc();
		obj.main(7);
		
		
	}
}