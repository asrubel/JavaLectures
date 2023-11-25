package khai.dict.com.lecture9;

public class Main {
    public static void main(String[] args) {
        encapsulationExample();

        objectEncapsulationExample();

        extendingClassExample();
    }

    public static void encapsulationExample() {
        Counter counter = new Counter();

        System.out.println(counter.getCurrent());
        counter.inc();
        counter.inc();
        System.out.println(counter.getCurrent());
    }

    public static void objectEncapsulationExample() {
        Salary salary = new Salary(2000);
        Promotion promotion = new Promotion(salary);
        promotion.promote();

        System.out.println(salary.income);
        System.out.println(promotion.salary.income);
    }

    public static void extendingClassExample() {
        Laptop laptop = new Laptop();
        SmartPhone smartPhone = new SmartPhone(laptop);
        SmartWatch smartWatch = new SmartWatch(laptop);

        smartPhone.sendDataToLaptop("Hello there!");
        smartWatch.sendDataToLaptop("I am also connected!");

        smartWatch.notify("!!!!!!!!");
    }
}
