import java.io.*;
import java.util.*;

public class vector2 {
    public static void main(String[] args) {
        System.out.println("Raushan kumar");
        

int n = 5;

Vector<Integer> v = new Vector<Integer>(n);

// Appending new elements at the end of the vector

for (int i = 1; i <= n; i++)
{
    v.add(i);
    
}
System.out.println(v);


// Printing elements



// Remove element at index 3

v.remove(3);

// Displaying the vector after deletion

System.out.println(v);

// Printing elements one by one

for (int i = 0; i < v.size(); i++)
{
    System.out.print(v.get(i) + " ");
}


}
    
}
