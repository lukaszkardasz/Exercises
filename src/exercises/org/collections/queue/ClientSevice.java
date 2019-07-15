package exercises.org.collections.queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author n2god on 15/07/2019
 * @project Exercises
 */
public class ClientSevice {
    public static void main(String[] args) {
        Queue<Client> clientQueue = new LinkedList<>();

        clientQueue.add(new Client("Grażynka"));
        clientQueue.add(new Client("Franio"));
        clientQueue.add(new Client("n2"));
        clientQueue.add(new Client("meni"));

        System.out.println("peek 1: " + clientQueue.peek()); //patrzymy
        System.out.println("peek 2: " + clientQueue.peek());

        System.out.println("poll 1: " + clientQueue.poll());
        System.out.println("poll 2: " + clientQueue.poll() + "\n");

        System.out.println("Stan kolejki: " + clientQueue);
        System.out.println("peek "+ clientQueue.peek());
        System.out.println("Stan kolejki: " + clientQueue);
        System.out.println("poll "+ clientQueue.poll());
        System.out.println("Stan kolejki: " + clientQueue);
    }
}
