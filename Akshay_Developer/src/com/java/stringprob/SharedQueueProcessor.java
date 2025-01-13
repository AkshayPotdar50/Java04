package com.java.stringprob;

import java.util.concurrent.*;

public class SharedQueueProcessor {
    public static void main(String[] args) throws InterruptedException {
        // Shared queue to hold records
        BlockingQueue<String> queue = new LinkedBlockingQueue<>();

        // Add records to the queue
        for (int i = 1; i <= 100; i++) {
            queue.put("Record-" + i);
        }

        // Thread pool with a fixed number of threads
        int numThreads = 4;
        ExecutorService executor = Executors.newFixedThreadPool(numThreads);

        // Runnable task for processing records
        Runnable task = () -> {
            try {
                while (true) {
                    // Retrieve and remove a record from the queue
                    String record = queue.poll(1, TimeUnit.SECONDS);
                    if (record == null) {
                        // Exit if the queue is empty after waiting
                        break;
                    }
                    processRecord(record);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        };

        // Submit tasks to the executor
        for (int i = 0; i < numThreads; i++) {
            executor.submit(task);
        }

        // Shutdown the executor gracefully
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.MINUTES);
        System.out.println("All records processed!");
    }

    private static void processRecord(String record) {
        System.out.println(Thread.currentThread().getName() + " processing: " + record);
        // Simulate processing time
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

