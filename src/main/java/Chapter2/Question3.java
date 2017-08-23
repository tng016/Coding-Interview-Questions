package Chapter2;

/**
 * Created by tzeyangng on 16/3/17.
 */
public class Question3 {
    //Implement an algorithm to delete a node in the middle of a singly linked list, given only access to that node.

    public static String solve(LinkedList middle,LinkedList head){
        LinkedList runner = middle.getNext();

        while (runner.getNext()!= null){
            middle.setData(runner.getData());
            middle = middle.getNext();
            runner = runner.getNext();
        }
        middle.setData(runner.getData());
        middle.setNext(null);

        return LinkedList.toString(head);
    }
}
