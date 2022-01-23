//import java.util.Vector;
import java.util.Stack;
public class vector {
    public static void main(String[] args) {
        System.out.println("raushan kumar");
        //Vector <Integer> v =new Vector();
       // v.add(3);
        //System.out.println(s);
        Stack <Integer> stack=new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(178);
        stack.push(50);
        stack.push(80);
        int Popped=stack.pop();
        int Peek=stack.peek();
        System.out.println("popped item is "+Popped);
        System.out.println("peek item is "+ Peek);



    }
    
}
