import java.util.Arrays;

public class string {
    public static void main(String[] args) {
        int[] marks=new int[3];
        marks[0]=88;
        marks[1]=22;
        marks[2]=44;
        //System.out.println(array.sort[2]);
        System.out.println(marks[2]);
        //length
        System.out.println("length of array = "+marks.length);
        //array sort
        Arrays.sort(marks);
        System.out.println(marks[1]);


        String name="Raushan kumar";
        //use length function
        System.out.println("length of character = "+name.length());
        //use char function
        System.out.println(name.charAt(5));
        //use replace 
        String name2=name.replace('a', 'b');
        System.out.println(name.substring(3, 13));

        System.out.println(name2+"\n"+name);
    }
}
