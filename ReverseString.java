import java.util.*;
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any String.......");
        String name=sc.nextLine();
        int leng=name.length();
        int reverse="";
        for (int i = leng-1; i >=0; i--) {
            reverse=name.charAt(i);
            
        }
        System.out.println("Your Reverse name is "+ name + " = "+reverse);

    }
}
