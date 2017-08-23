package Chapter2;

/**
 * Created by tzeyangng on 16/3/17.
 */
public class Question2 {
    //Implement an algorithm to find the kth to last element of a singly linked list.
    public static int solve(LinkedList head,int k){
        LinkedList pointer = head;
        LinkedList runner = head;
        for (int i=0;i<k;i++){
            if (runner.getNext() == null){
                return -1;
            }
            runner = runner.getNext();
        }

        while (runner.getNext()!= null){
            runner = runner.getNext();
            pointer = pointer.getNext();
        }

        return pointer.getData();
    }
}
