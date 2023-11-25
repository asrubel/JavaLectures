package khai.dict.com.lecture10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        abstractClassExample();

        interfaceExample();

        multiInterfacesExample();

        comparableInterfaceExample();
    }

    public static void chargeDevice(USB device) {
        device.charge();
    }

    public static void transferViaAir(WiFi device) {
        device.transmitData("via air only...");
    }

    public static void showSomething(HDMI device) {
        device.showManufacturer();
        device.display();
    }

    public static void callPet(Pet pet) {
        pet.makeSound();
    }

    public static void abstractClassExample() {
        Dog dog = new Dog("Bobik", 3);
        Cat cat = new Cat("Murzik", 2);

        callPet(dog);
        callPet(cat);

        dog.makeSound();
        cat.makeSound();
    }

    public static void interfaceExample() {
        DrawingTool pencil = new Pencil();
        DrawingTool brush = new Brush();

        pencil.draw("||||");
        brush.draw("OOO");
    }

    public static void multiInterfacesExample() {
        Laptop laptop = new Laptop();
        laptop.charge();
        laptop.display();
        laptop.transferData("via cable");
        laptop.transmitData("via air");

        chargeDevice(laptop);
        transferViaAir(laptop);
        showSomething(laptop);

        SmartPhone smartPhone = new SmartPhone();
        chargeDevice(smartPhone);
        transferViaAir(smartPhone);
    }

    public static void comparableInterfaceExample() {
        List<Car> cars = new ArrayList<>();
        Car car1 = new Car(1234, "BMV X5", 10, "Black");
        Car car2 = new Car(1434, "Audi A5", 8, "Blue");
        Car car3 = new Car(1534, "Mercedes 600", 11, "Red");
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);

        Collections.sort(cars);
        System.out.println(cars);
    }
}
