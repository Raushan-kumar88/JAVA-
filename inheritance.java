class A
{
    void displayA()
    {
        System.out.println("I am class A");
    }
}
class B extends A
{
    void displayB() 
    {
        System.out.println("I am class B ");
    }
}

public class inheritance extends B
{
    void displayC() 
    {
        System.out.println("I am class main C");
    }
    public static void main(String[] args)
    {
        System.out.println("Raushan kumar");
        System.out.println("A CLASS ");
        A obj=new A();
        obj.displayA();
        System.out.println("B CLASS ");
        B obj1 = new B();
        obj1.displayA();
        obj1.displayB();
        System.out.println("C CLASS ");
        inheritance obj2 = new inheritance();
        obj2.displayA();
        obj2.displayB();
        obj2.displayC();

    }
    
    
}
