package khai.dict.com.lecture7;

//import khai.dict.com.lecture8.Student;

class MyClass {

}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        staticExample();

        staticPropertyExample();

        outerPackageExample();
    }

    public static void staticExample() {
        Student.university = "KhAI";
        Student.course = 2;

        Student student1 = new Student("John", 20, 80.5f);
        student1.printInstance();
        System.out.println(student1.getName() + " " + student1.age + " " + student1.weight);

        Student student2 = new Student("Anna", 18, 60.7f);
        student2.printInstance();
        System.out.println(student2.getName() + " " + student2.age + " " + student2.weight);

        Student.printStatic();

        student2.sayHello(student1);
        student1.sayHello(student2);

        System.out.println(student1.university);
        System.out.println(student2.university);
    }

    public static void staticPropertyExample() throws InterruptedException {
        DateClass date1 = new DateClass();
        System.out.println(DateClass.lastCreated);

        Thread.sleep(1000);

        DateClass date2 = new DateClass();
        System.out.println(DateClass.lastCreated);

        Thread.sleep(1000);

        DateClass date3 = new DateClass();
        System.out.println(DateClass.lastCreated);

        System.out.println(DateClass.C);
    }

    public static void outerPackageExample() {
        /*Student student = new Student();
        System.out.println(student.getGroup());*/
    }
}
