package khai.dict.com.lecture14;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        considerMainThread();

        newThreadsCreating();

        showThreadsConcurrency();

        makeSleeping();

        useJoinManaging();
    }

    public static void considerMainThread() {
        Thread thread = Thread.currentThread();

        System.out.println(thread.getName());
        System.out.println(thread.getId());
        System.out.println(thread.isAlive());
        System.out.println(thread.isDaemon());
        System.out.println(thread.getPriority());

        thread.setName("Custom-thread");
        System.out.println(thread.getName());
    }

    public static void newThreadsCreating() {
        Thread t1 = new CustomThread();
        Thread t2 = new Thread(new CustomRunnable());

        Thread t3 = new Thread(() -> {
            System.out.printf("Hello, %s%n",
                    Thread.currentThread().getName());
        });

        t1.start();
        t2.start();
        t3.start();
        System.out.println(Thread.currentThread().getName());
    }

    public static void showThreadsConcurrency() {
        Thread t1 = new CustomThread();
        Thread t2 = new CustomThread();

        t1.start();
        t2.start();

        System.out.println("Done!");
    }

    public static void makeSleeping() throws InterruptedException {
        System.out.println("Started");
        Thread.sleep(1000L);
        System.out.println("Done!");
        TimeUnit.SECONDS.sleep(5);
        System.out.println("Yet another one!");
    }

    public static void useJoinManaging() throws InterruptedException {
        Thread t = new CustomThread();
        t.start();

        System.out.println("Something happening...");
        t.join();
        System.out.println("Do something else...");
    }
}
