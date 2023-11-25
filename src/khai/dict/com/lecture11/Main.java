package khai.dict.com.lecture11;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        readFileExample();

        arithmeticExceptionExample();

        numberFormatExceptionExample();

        tryExample();
    }

    public static void readFileExample() throws IOException {
        File file = new File("my.txt");
        System.out.println(file.exists());
        System.out.println("File name: " + file.getName());
        System.out.println("File path: " + file.getPath());
        System.out.println("Is file: " + file.isFile());
        System.out.println("Is directory: " + file.isDirectory());

        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }

        System.out.println(readFileAsString("my.txt"));
    }

    public static void arithmeticExceptionExample() {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if (num2 == 0) {
            System.out.println("Div by zero!");
        } else {
            System.out.println(num1 / num2);
        }
        System.out.println("Done!");
    }

    public static void numberFormatExceptionExample() {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        if (userInput.matches("\\d+")) {
            int num = Integer.parseInt(userInput);
            System.out.println(num - 1);
        } else {
            System.out.println("Incorrect input: " + userInput);
        }
    }

    public static void tryExample() {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        try {
            System.out.println("Try block");
            int num = Integer.parseInt(userInput);
            System.out.println(num / (num - 1));
            throw new UserException("My exception");
        } catch (NumberFormatException e) {
            System.out.println("Wrong input! " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Div by zero! " + e.getMessage());
        } catch (UserException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Doing every time");
        }
    }

    public static String readFileAsString(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }
}

class UserException extends Exception {
    public UserException(String message) {
        super(message);
    }

    public UserException(Throwable cause) {
        super(cause);
    }
}
