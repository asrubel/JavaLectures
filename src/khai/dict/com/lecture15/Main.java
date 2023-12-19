package khai.dict.com.lecture15;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        concurrencyExample();

        synchronizationExample();

        executorExample();
    }

    public static void concurrencyExample() throws InterruptedException {
        Counter counter = new Counter();

        MyThread thread1 = new MyThread(counter);
        MyThread thread2 = new MyThread(counter);

        thread1.start();
        thread1.join();

        thread2.start();
        thread2.join();

        System.out.println(counter.getValue());
    }

    public static void synchronizationExample() {
        MyClass instance1 = new MyClass("instance1");
        MyClass instance2 = new MyClass("instance2");

        SomeThread thread0 = new SomeThread(instance1);
        SomeThread thread1 = new SomeThread(instance1);
        SomeThread thread2 = new SomeThread(instance2);

        thread0.start();
        thread1.start();
        thread2.start();
    }

    public static void executorExample() throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        executorService.submit(() -> System.out.println("Thread started."));
        executorService.shutdown();

        boolean terminated = executorService.awaitTermination(1000000, TimeUnit.NANOSECONDS);
        if (terminated) {
            System.out.println("Terminated");
        } else {
            System.out.println("Not terminated");
        }
    }
}

class MyClass {
    private String name;

    public MyClass(String name) {
        this.name = name;
    }

    public synchronized void doSmt() {
        String threadName = Thread.currentThread().getName();
        System.out.printf("%s entered the method of %s%n", threadName, name);
        System.out.printf("%s leaves the method of %s%n", threadName, name);
    }

    public void syncInstanceMethod() {
        System.out.println("Start");

        synchronized (this) {
            System.out.println(name);
        }
    }
}

class SomeThread extends Thread {
    private MyClass myClass;

    public SomeThread(MyClass myClass) {
        this.myClass = myClass;
    }

    @Override
    public void run() {
        myClass.doSmt();
    }
}
