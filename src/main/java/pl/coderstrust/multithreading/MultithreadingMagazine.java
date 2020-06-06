package pl.coderstrust.multithreading;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

public class MultithreadingMagazine {

    public static void main(String[] args) {
        ArrayBlockingQueue<String> messageList = new ArrayBlockingQueue<>(10);

        new Thread(new Producer(messageList)).start();
        new Thread(new Consumer(messageList)).start();
        new Thread(new Consumer(messageList)).start();
    }

    static class Producer implements Runnable {
        private final ArrayBlockingQueue<String> queue;

        Producer(ArrayBlockingQueue<String> messageList) {
            queue = messageList;
        }

        @Override
        public void run() {
            while (true) {
                try {
                    queue.put(produce());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        String produce() {
            Random random = new Random();
            int i = random.nextInt(100);
            System.out.println(Thread.currentThread().getName() + " WRITING a message: Message " + i);
            return "Message " + i;
        }
    }

    static class Consumer implements Runnable {
        private final ArrayBlockingQueue<String> queue;

        Consumer(ArrayBlockingQueue<String> messageList) {
            queue = messageList;
        }

        @Override
        public void run() {
            while (true) {
                try {
                    consume(queue.take());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        void consume(String s) {
            System.out.println(Thread.currentThread().getName() + " reading a message: " + s);
        }
    }
}
