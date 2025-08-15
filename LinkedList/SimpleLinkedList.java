public class SimpleLinkedList {

    Node head;

    static class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    public void printlist() {
        Node n = head;
        while (n != null) {
            System.out.println(n.data + " ");
            n = n.next;
        }
    }

    public static void main(String[] args) {
        SimpleLinkedList llist = new SimpleLinkedList();
        llist.head = new Node(5);
        Node head1 = new Node(10);
        Node head2 = new Node(10);
        llist.head.next = head1;
        head1.next = head2;

        llist.printlist();

    }
}
