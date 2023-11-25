package khai.dict.com.lecture8;

import khai.dict.com.lecture9.*;

import khai.dict.com.lecture9.Salary;

class SuperClass {}

class SubClassA extends SuperClass {}

class SubClassB extends SuperClass {}

class SubClassC extends SubClassB {}

class Person {
    protected String name;
    protected int age;
}

class Teacher extends Person {
    protected String title;
    private boolean inVacation;

    public boolean isInVacation() {
        return inVacation;
    }

    public void setInVacation(boolean inVacation) {
        this.inVacation = inVacation;
    }
}

class Dean extends Teacher {
    protected String faculty;
    protected int experience;
}

interface Chargeable {
    void charge();
}

class Device implements Chargeable {
    @Override
    public void charge() {
        System.out.println("Device is charging...");
    }
}

public class Main {
    public static void main(String[] args) {
        castExtendingExample();

        objectCastingExample();

        packageScopeExample();
    }

    public static void castExtendingExample() {
        Person student = new Student();
        Person teacher = new Teacher();
        Person dean = new Dean();

        /*Student student = new Student();
        Person teacher = new Teacher();
        Person dean = new Dean();

        student.setGroup("528");
        System.out.println(student.getGroup());*/
    }

    public static void objectCastingExample() {
        Object obj = new Object();
        Long longInt = 1_000_000_000L;
        Object number = longInt;
    }

    public static void packageScopeExample() {
        Salary salary = new Salary(2000);
        Promotion promotion = new Promotion(salary);
        promotion.promote();

        /*System.out.println(salary.income);
        System.out.println(promotion.salary.income);*/

        Laptop laptop = new Laptop();
        SmartPhone smartPhone = new SmartPhone(laptop);
        SmartWatch smartWatch = new SmartWatch(laptop);

        /*smartPhone.sendDataToLaptop("Hello there!");
        smartWatch.sendDataToLaptop("I am also connected!");
        smartWatch.notify("!!!!!!!!");*/
    }
}
