public class InsertAfterDemo {

    static class Node {
        int trackId;
        Node next;

        Node(int trackId) {
            this.trackId = trackId;
        }
    }

    static void insertAfter(Node current, int trackId) {

        if (current == null)
            return;

        Node newNode = new Node(trackId);

        newNode.next = current.next;
        current.next = newNode;
    }

    static void print(Node head) {

        while (head != null) {
            System.out.print(head.trackId + " ");
            head = head.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Node head = new Node(101);
        head.next = new Node(102);
        head.next.next = new Node(104);

        System.out.println("Before Insertion:");
        print(head);

        insertAfter(head.next, 103);

        System.out.println("After Insertion:");
        print(head);
    }
}