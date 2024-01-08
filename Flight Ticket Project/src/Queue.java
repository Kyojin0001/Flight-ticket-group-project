public class Queue {
    private Ticket[] array;
    private int front, rear, size;

    public Queue(int capacity) {
        array = new Ticket[capacity];
        front = this.size = 0;
        rear = capacity - 1;
    }

    public void enqueue(Ticket ticket) {

        if (isFull()) {
            throw new IllegalStateException("Queue is full");
        }
        rear = (rear + 1) % array.length;
        array[rear] = ticket;
        size++;
    }

    public Ticket dequeue() {

        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        Ticket ticket = array[front];
        front = (front + 1) % array.length;
        size--;
        return ticket;
    }

    public boolean isEmpty() {
        
        return size == 0;
    }

    public boolean isFull() {
        return size == array.length;
    }
}
