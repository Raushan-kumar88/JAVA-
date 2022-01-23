import java.util.*;
class demo
{
    String name="Raushan kumar";

}
class demo2 extends demo
{
    //int id =125;
    String name="Reyaz Ansari";
    void display(String name)
    {
        System.out.println("Argument passes program "+name);
        System.out.println("use of this keyword "+this.name);
        System.out.println("use of super keyword "+super.name);
    }
}
public class superKeyword {
    public static void main(String[] args) {
        System.out.println("Super and this keyword program-------");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name ");
        String name=sc.nextLine();
        demo2 obj=new demo2();
        obj.display(name);
        System.out.print("Program successfull Run -----");


    }
    
}
