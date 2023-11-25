package khai.dict.com.lecture10;

public abstract class Pet {
    public String name;
    public int age;

    Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void makeSound();
}

class Cat extends Pet {
    Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Mew!!! " + this.name + "!!!");
    }
}

class Dog extends Pet {
    Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof!!! " + this.name + "!!!");
    }
}
