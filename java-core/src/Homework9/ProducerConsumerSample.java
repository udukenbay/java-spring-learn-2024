package Homework9;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class ProducerConsumerSample {
    private static final int QUEUE_CAPACITY = 5;
    private static BlockingDeque<Integer> queue = new LinkedBlockingDeque<>(QUEUE_CAPACITY);

    public Runnable producer = () -> {
        try {
            for (int i = 1; i <= 10; i++) {
                queue.put(i);
                System.out.println("Produced: " + i);
                Thread.sleep(1000); // Simulating some time to produce data
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    };

    public Runnable consumer = () -> {
        try {
            while (true) {
                int num = queue.take();
                System.out.println("Consumed: " + num);
                Thread.sleep(2000); // Simulating some time to process data
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    };
}
