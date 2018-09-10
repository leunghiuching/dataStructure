package linketlist;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

    @Test
    public void testInsert() {
        Node head = new Node(null, 1);
        LinkedList linkedList = new LinkedList(head);
        Node second = new Node(null, 2);
        linkedList.insert(second);
        Node thrid = new Node(null,3);
        linkedList.insert(thrid);
        Node four = new Node(null,4);
        linkedList.insert(four,2);
        assertEquals(second.getNext(), four);

    }
}