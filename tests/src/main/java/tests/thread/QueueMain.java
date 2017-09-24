package tests.thread;

import java.util.Random;
import java.util.stream.IntStream;

/**
 * @author amos
 * @date 2017-09-22
 */
public class QueueMain{
    public static void main(String[] args) {
        Queue queue = new Queue();
        for (int i = 0; i < 3; i++) {
            new Thread(() -> {
                queue.add(new Random().nextInt());
                System.out.println(queue.count);
            }).start();
        }
        // the ouput is 1, if QueueOutOfMemory is threadsafe;
        // but the real output is 3, so the QueueOutOfMemory is not threadsafe.
    }
}
