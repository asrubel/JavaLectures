package khai.dict.com.lecture10;

public class SmartPhone implements USB, WiFi {
    @Override
    public void charge() {
        System.out.println("Charging phone...");
    }

    @Override
    public void transferData(String data) {
        System.out.println("Transferring from phone... " + data);
    }

    @Override
    public void transmitData(String data) {
        System.out.println("Transmitting from phone... " + data);
    }
}
