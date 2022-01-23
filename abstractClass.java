
public class abstractClass {
    public static void main(String[] args) {
        System.out.println("abstact class program=");
        daughter obj=new daughter();
        beti obj1=new beti();
        obj.show();
        obj1.show();
    }
    
}
abstract class A
{
    abstract void show();
}
class daughter extends A
{
    void show()
    {
        System.out.println("I am Raushan kumar");

    }
}
class beti extends A
{
    void show()
    {
        System.out.print("I am Reyaz ansari");
    }
}