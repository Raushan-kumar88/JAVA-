import java.util.*;

import javax.sound.sampled.SourceDataLine;
public class String1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name ");
        String name=sc.nextLine();
        /*int name1=name.length();
        String lower=name.toLowerCase();
        String upper=name.toUpperCase();
        System.out.println("The total charcter of your name "+name+" is "+name1);
        System.out.println(lower);
        System.out.println(upper);
        String nonstremString= "     Raushan      ";
        System.out.println(nonstremString.trim());*/
        System.out.println(name.substring(5));
        System.out.println(name.substring(3,9));
        System.out.println(name.replace(oldChar:'s',newChar:'m'));
        
    }
    
}
