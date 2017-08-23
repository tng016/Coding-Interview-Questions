package InnovateInHealth;

/**
 * Created by tzeyangng on 6/1/17.
 */
public class StringComparator {
    private static String str1;
    private static String str2;
    public static void main(String[] args){
        char[] arrays = new char[1000000];
        for (int i=0;i<1000000;i++)
        {
            arrays[i] = (char)(i%26 + 97);
        }

        str1 = String.valueOf(arrays);
        str1 += "abcdefghijkz";
        str2 = "abcdefghijky";

        long startTime = System.nanoTime();
        System.out.println(strCompare());
        long endTime = System.nanoTime();

        long duration = (endTime - startTime);
        System.out.println(duration/Math.pow(10,9));

    }

    private static int strCompare(){
        int b = str2.length();
        int a = str1.length();

        if(a<b || a == 0 || b==0){
            return -1;
        }

        for (int i=0; i<a;i++){
            if(charCompare(i,b)){
                return i;
            }
        }
        return -1;
    }

    private static boolean charCompare(int i, int b){
        for (int j=0;j<b;j++){
            if (str1.charAt(i+j)!=str2.charAt(j)){
                return false;
            }
        }
        return true;
    }

}
