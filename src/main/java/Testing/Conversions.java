package Testing;

/**
 * Created by tzeyangng on 29/12/16.
 */
public class Conversions {
    public static void main(String[] args){
        int count = 123;
        String str = "1234";
        char c = '1';

        //Int to String
        System.out.println(Integer.toString(count));
        System.out.println(String.valueOf(count));

        //String to Int
        System.out.println(Integer.parseInt(str));

        //Char to Int using ASCII
        System.out.println(count = (int)c - '0');

        //Int to Char
        System.out.println((char)50);
    }
}
