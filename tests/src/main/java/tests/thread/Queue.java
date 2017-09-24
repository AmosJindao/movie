package tests.thread;

import java.util.concurrent.TimeUnit;

//Show the methods are not threadsafe.
//Then modify so that they are threadsafe.
public class Queue{
    class Node{

        Object value;
        Node next;
    }

    int count = 0;

    Node head;
    Node tail;

    public void add(Object newValue) {
        Node n = new Node();
        if (head == null) {
            count++;

            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            head = n;
        }else
            tail.next = n;
        tail = n;
        tail.value = newValue;
    }

    public Object remove() {
        if (head == null)
            return null;
        Node n = head;
        head = n.next;
        return n.value;
    }
}
