//import java.io.FileInputStream;
class B
{
	public static void main(String[] args)
	{
		/*try
		{
			
		     FileInputStream sc=new FileInputStream("d:/abc.text");
		}
		catch(Exception e)
        {
            System.out.println(e);
        }*
        int a=200;
        int b=0;
        int c=a/b;
         System.out.println(c);
         //System.out.println(2*a+b);	*/
		 
       System.out.println("Exception progrom ");
        try
        {
            int a=5;
            int b=0;
            int c=a/b;
            System.out.println(c);

        }
        catch(ArithmeticException e)
        {
			e.printStackTrace();
			System.out.println(e);
			System.out.println(e.toString());
			System.out.println(e.getMessage());

        }
		finally
		{
			System.out.println(" Raushan Kumar jghhgdg");
		}
       /* int i=50,j=0,data;
        try{
            data=i/j;
            System.out.println(data);
        }
        catch(Exception e)
        {
            System.out.println(i/(j+2));
        }*/
        System.out.println("Raushan kumar");
		 
	}
}