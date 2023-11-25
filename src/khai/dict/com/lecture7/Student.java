package khai.dict.com.lecture7;

public class Student {
    private String name;
    int age;
    float weight;
    static String university;
    static int course;

    public Student(String name, int age, float weight) {
        this.setName(name);
        this.age = age;
        this.weight = weight;
    }

    public void printInstance() {
        System.out.println("Instance method");
    }

    public static void printStatic() {
        System.out.println("Static method");
    }

    public void sayHello(Student student) {
        System.out.println("Hello " + student.getName() + "! I am " + this.getName() + ".");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
