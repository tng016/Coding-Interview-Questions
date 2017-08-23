package Chapter2;

/**
 * Created by tzeyangng on 15/3/17.
 */
public class LinkedList {
    public LinkedList next;
    public LinkedList previous;
    public int data;

    public LinkedList(int data){
        this.data = data;
    }

    public LinkedList getNext() {
        return next;
    }

    public void setNext(LinkedList next) {
        this.next = next;
    }

    public LinkedList getPrevious() {
        return previous;
    }

    public void setPrevious(LinkedList previous) {
        this.previous = previous;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public LinkedList createNext(int i){
        next = new LinkedList(i);
        next.setPrevious(this);
        return next;
    }

    public static String toString(LinkedList head){
        LinkedList pointer = head;
        String s = "[";
        while(pointer.getNext() != null){
            s += pointer.getData() + ",";
            pointer = pointer.getNext();
        }
        s += pointer.getData() + "]\n";
        return s;
    }
}
