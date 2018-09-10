package linketlist;

public class LinkedList {

    private Node head;

    public LinkedList(Node head) {
        this.head = head;
    }

    public void insert(Node node) {
        Node cursor = head;
        while (cursor.getNext() != null) {
            cursor = cursor.getNext();
        }
        cursor.setNext(node);
    }
    public void insert(Node node,int value){

        Node cursor = head;
        Node temp ;
        while (cursor.getNext()!=null){
            cursor = cursor.getNext();
            if (cursor.getValue()==value){
                temp = cursor.getNext();
                cursor.setNext(node);
                node.setNext(temp);
            }
        }
    }
}