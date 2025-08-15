class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

class LinkedList {
    Node head;

    public void printlist() {
        Node n = head;
        while (n != null) {
            System.out.println(n.data + " ");
            n = n.next;
        }
    }
}

public class SimpleLinkedList {

    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        llist.head = new Node(5);
        Node head1 = new Node(10);
        Node head2 = new Node(10);
        llist.head.next = head1;
        head1.next = head2;

        llist.printlist();

    }
}
