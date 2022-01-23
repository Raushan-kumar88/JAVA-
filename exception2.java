public class exception2 {
    public static void main(String[] args) {
        System.out.println("Raushan kumar");
        try
        {
            int a=2,b=0,c;
            c=a/b;
            System.out.println(c);
        }

        catch(ArithematicException e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("I am main block");
        }
    }
    
}
