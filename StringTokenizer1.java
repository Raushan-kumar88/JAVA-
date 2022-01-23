import java.util.*;
public class StringTokenizer1 {
    public static void main(String[] args) {
        System.out.println("Program of string tokonizer");
        StringTokenizer sc=new StringTokenizer("I am Raushan kumar");
        Date obj=new Date();
        Calendar calendar = Calendar.getInstance();
        // Demonstrate Calendar's get()method
        System.out.println("Current Calendar's Year: " + calendar.get(Calendar.YEAR));
       //System.out.println("Current Calendar's Day: " + calendar.get(Calendar.DATE));
        //System.out.println("Current MINUTE: " + calendar.get(Calendar.MINUTE));
        //System.out.println("Current SECOND: " + calendar.get(Calendar.SECOND));
        
        while(sc.hasMoreTokens())
        {
            System.out.println(sc.nextToken());
        }
       System.out.println("Current date = "+obj);


    }
    
}
