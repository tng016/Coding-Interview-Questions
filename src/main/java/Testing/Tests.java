package Testing;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

/**
 * Created by tzeyangng on 29/12/16.
 */
public class Tests {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        Hashtable storage = new Hashtable();
        int count = 1;
        storage.put(count,"Hello");
        storage.put(count,"There");
        storage.put(count,"World");
        System.out.println(storage.toString());



    }

}
