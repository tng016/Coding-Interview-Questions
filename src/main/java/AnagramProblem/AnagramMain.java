package AnagramProblem;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by tzeyangng on 28/12/16.
 */
public class AnagramMain {
    private static LinkedList[] hashStorage = new LinkedList[26];
    public static Scanner sc = new Scanner(System.in);

    public static void anagram(String one, String two){
        char[] wordone = one.toCharArray();
        char[] wordtwo = two.toCharArray();
        for (char i:wordone){
            hash(i);
        }
        for (char i:wordtwo){
            hash(i);
        }
    }

    public static void hash(char c){
        int i = (int) c - 97;
        hashStorage[i].add(i);
    }

    public static void main(String[] args){
        for (int i =0;i<26;i++){
            hashStorage[i] = new LinkedList<>();
        }
        String wordOne = sc.next();
        String wordTwo = sc.next();
        anagram(wordOne, wordTwo);
        for (int i =0;i<26;i++){
            if(hashStorage[i].size() == 1) {
                System.out.println((char) ((int) hashStorage[i].pop() + 97));
            }
        }
    }
}
