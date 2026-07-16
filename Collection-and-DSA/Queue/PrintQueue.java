import java.util.*;

public class PrintQueue {

    Deque<Integer> queue = new ArrayDeque<>();

    // Normal job
    public void addLast(int jobId) {
        queue.addLast(jobId);
    }

    // Urgent job
    public void addFirst(int jobId) {
        queue.addFirst(jobId);
    }

    // Print next job
    public int removeFirst() {
        if (queue.isEmpty()) {
            throw new RuntimeException("Queue Empty");
        }
        return queue.removeFirst();
    }

    public void display() {
        System.out.println(queue);
    }

    public static void main(String[] args) {

        PrintQueue pq = new PrintQueue();

        pq.addLast(101);
        pq.addLast(102);
        pq.addLast(103);

        pq.display();

        pq.addFirst(999);

        pq.display();

        System.out.println("Printing: " + pq.removeFirst());

        pq.display();
    }
} {
    
}
