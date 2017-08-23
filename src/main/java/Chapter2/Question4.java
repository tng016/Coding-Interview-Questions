package Chapter2;

/**
 * Created by tzeyangng on 16/3/17.
 */
public class Question4 {
    //Write code to partition a linked list around a value x,
    // such that all nodes less than x come before all nodes greater than or equal to x.
    public static LinkedList solve(LinkedList head, int x){
        LinkedList headPointer = head;
        LinkedList secondll = new LinkedList(0);
        LinkedList secondPointer = secondll;

        while(headPointer.getNext()!=null){
            if (headPointer.getData()<x){
                headPointer = headPointer.getNext();
            }
            else{
                headPointer.getPrevious().setNext(headPointer.getNext());
                secondPointer.setNext(headPointer);
                headPointer = headPointer.getNext();
                secondPointer = secondPointer.getNext();
                secondPointer.setNext(null);
            }
        }

        return head;
    }

    public static boolean isCorrect(LinkedList head,int x){
        while(head.getData()<x){
            if (head.getNext()!=null)
                head = head.getNext();
            else
                return false;
        }
        while(head.getData()>=x){
            if (head.getNext()==null)
                return true;
            else
                head = head.getNext();
        }
        return false;
    }
}
