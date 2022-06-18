import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String.......");
        String name = sc.nextLine();
        int leng = name.length();
        String reverse = "";
        for (int i = leng - 1; i >= 0; i--) {
            reverse = reverse + name.charAt(i);

        }
        System.out.println("Your Reverse name is " + name + " = " + reverse);
        int rev = 0;
        System.out.println("enter any digit ...");
        int n = sc.nextInt();
        while (n != 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;

        }
        System.out.println("your reverse number is " + rev);

    }
}
