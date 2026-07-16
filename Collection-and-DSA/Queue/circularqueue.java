class PacketBuffer {
    private int[] data;
    private int front;
    private int count;

    PacketBuffer(int capacity) {
        data = new int[capacity];
        front = 0;
        count = 0;
    }

    // Add packet
    public boolean enqueue(int packetId) {
        if (count == data.length) {
            System.out.println("Buffer Full");
            return false;
        }

        int rear = (front + count) % data.length;
        data[rear] = packetId;
        count++;
        return true;
    }

    // Remove packet
    public int dequeue() {
        if (count == 0) {
            throw new RuntimeException("Buffer Empty");
        }

        int value = data[front];
        front = (front + 1) % data.length;
        count--;

        return value;
    }

    public void display() {
        for (int i = 0; i < count; i++) {
            System.out.print(data[(front + i) % data.length] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PacketBuffer buffer = new PacketBuffer(5);

        buffer.enqueue(10);
        buffer.enqueue(20);
        buffer.enqueue(30);

        buffer.display();

        System.out.println("Processed: " + buffer.dequeue());

        buffer.display();

        buffer.enqueue(40);
        buffer.enqueue(50);
        buffer.enqueue(60);

        buffer.display();
    }
}