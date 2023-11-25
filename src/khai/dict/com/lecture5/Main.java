package khai.dict.com.lecture5;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        // Press Ctrl+R or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Ctrl+D to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Cmd+F8.
            System.out.println("i = " + i);
        }

        stringExample();

        primitiveTypesExample();

        charactersExample();

        castingExample();
    }

    public static void stringExample() {
        System.out.println("Java");
        System.out.println(" 17, ");
        System.out.println();
        System.out.println('!');
        System.out.println(100);
        System.out.println(true);
        System.out.println(7.8);

        String str = "Java";
        int num = 100;

        String dayOfWeek;
        dayOfWeek = "Tuesday";
        dayOfWeek = "Sunday";
    }

    public static void primitiveTypesExample() {
        var myVar = 1000;

        byte myByte = 100;
        short myShort = 10000;
        int myInt = 100000;
        long myLong = 100_000_000L;

        double myDouble = 1000.007;
        float myFloat = 134.8f;

        char myChar = '*';
        myInt = myChar;
        boolean myBool = true;

        System.out.println(myLong);
    }

    public static void charactersExample() {
        char lowerCase = 'a';
        char upperCase = 'A';
        int ascii1 = lowerCase;
        int ascii2 = upperCase;
        System.out.println(ascii1);
        System.out.println(ascii2);
    }

    public static void castingExample() {
        double someDouble = 2.33456678899655;
        long someLong = (long) someDouble;
        System.out.println(someLong);

        long bigLong = 1_000_000_000_000_000L;
        int someInt = (int) bigLong;
        System.out.println(someInt);

        /*int someInt = 1000;
        long someLong = (long) someInt;*/
    }
}