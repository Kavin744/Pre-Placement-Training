public class QueueArray {
    int front = 0, rear = -1;
    int[] queue = new int[5];

    void enqueue(int value) {
        if (rear == queue.length - 1)
            System.out.println("Queue Full");
        else
            queue[++rear] = value;
    }

    void dequeue() {
        if (front > rear)
            System.out.println("Queue Empty");
        else
            System.out.println("Dequeued: " + queue[front++]);
    }

    public static void main(String[] args) {
        QueueArray q = new QueueArray();
        q.enqueue(10);
        q.enqueue(20);
        q.dequeue();
    }
}
