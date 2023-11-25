package khai.dict.com.lecture9;

public class SmartWatch extends Mobile {
    private int heartRate;

    private Laptop laptop;

    public SmartWatch(Laptop laptop) {
        this.laptop = laptop;
    }

    private int countHeartRate() {
        return heartRate;
    }

    void sendDataToLaptop(String data) {
        notify(data);
        laptop.receiveInfo(data + ", heart rate: " + heartRate);
    }
}
