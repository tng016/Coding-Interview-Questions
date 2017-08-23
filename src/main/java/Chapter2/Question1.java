package Chapter2;

import com.sun.org.apache.xpath.internal.operations.Bool;
import sun.awt.image.ImageWatched;

import java.util.ArrayList;
import java.util.Hashtable;

/**
 * Created by tzeyangng on 15/3/17.
 */
public class Question1 {
    //Write code to remove duplicates from an unsorted linked list.
    // FOLLOW UP
    //How would you solve this problem if a temporary buffer is not allowed?
    public static String solve(LinkedList head){
        LinkedList pointer = new LinkedList(-2);
        pointer.setNext(head);
        ArrayList<Integer> list = new ArrayList<>();

        while (pointer.getNext() != null){
            pointer = pointer.getNext();
            if (list.contains(pointer.getData())){
                if (pointer.getNext() != null){
                    pointer.getNext().setPrevious(pointer.getPrevious());
                }
                pointer.getPrevious().setNext(pointer.getNext());
            }
            else{
                list.add(pointer.getData());
            }

        }

        return LinkedList.toString(head);
    }

    //no buffer
    public static String solve2(LinkedList head){
        LinkedList pointer = new LinkedList(-2);
        pointer.setNext(head);


        while (pointer.getNext() != null){
            pointer = pointer.getNext();
            LinkedList pointer2 = pointer;
            int temp = pointer.getData();
            while (pointer2.getNext() != null) {
                pointer2 = pointer2.getNext();
                if (pointer2.getData() == temp) {
                    if (pointer2.getNext() != null){
                        pointer2.getNext().setPrevious(pointer2.getPrevious());
                    }
                    pointer2.getPrevious().setNext(pointer2.getNext());
                }
            }
        }

        return LinkedList.toString(head);
    }

}
