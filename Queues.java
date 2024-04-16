import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        
        Queue<String> queue = new LinkedList<String>();

        

        queue.offer("Harry");
        queue.offer("Zayn");
        queue.offer("Niall");
        queue.offer("Liam");
        queue.offer("Louis");

        //System.out.println(queue.isEmpty());
        //System.out.println(queue.size());
        //System.out.println(queue.contains("Liam"));

        //System.out.println(queue.peek());
        //queue.poll();
        System.out.println(queue);
    }
}
