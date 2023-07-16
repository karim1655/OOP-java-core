package com.karim.lessons.lessons_.lez20230511;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Test {
    static class Producer extends Thread {
        Queue<Integer> queue;

        public Producer(Queue<Integer> queue) {
            this.queue = queue;
            int maxQueueSize = 10;

        }

        /*@Override
        public void run() {
            int i = 0;
            while (!isInterrupted()) {
                synchronized (queue) {
                    if(queue.size() < maxQueueSize) {
                        queue.add(i++);
                        queue.notifyAll();
                    }else {
                        try {
                            queue.wait();
                        } catch (InterruptedException e) {

                        }
                    }
                }
            }
        }*/

    }
    static class Consumer extends Thread {
        Queue<Integer> queue;

        public Consumer(Queue<Integer> queue) {
            this.queue = queue;
        }

        @Override
        public void run() {
            while (!isInterrupted()) {
                synchronized (queue) {
                    if(queue.size() > 0) {
                        System.out.println(queue.remove());
                        queue.notifyAll();
                    }else{
                        try {
                            queue.wait();
                        } catch (InterruptedException e) {

                        }
                    }
                }
            }
        }


    }


    public static void main(String[] args) throws InterruptedException {
        Queue queue = new ConcurrentLinkedQueue();
        Thread a = new Producer(queue);
        Thread b = new Consumer(queue);
        a.start();
        b.start();

        Thread.sleep(20);

        a.interrupt();
        b.interrupt();

        a.join();
        b.join();
    }
}
