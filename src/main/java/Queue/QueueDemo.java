package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        queue.offer("First");
        queue.offer("Second");
        queue.offer("Third");

        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
    }
}
