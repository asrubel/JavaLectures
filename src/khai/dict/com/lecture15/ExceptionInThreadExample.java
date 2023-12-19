package khai.dict.com.lecture15;

public class ExceptionInThreadExample {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new CustomThread();
        thread.start();
        thread.join();
        System.out.println("Done!");
    }
}

class CustomThread extends Thread {

    @Override
    public void run() {
        System.out.println(2 / 0);
    }
}
