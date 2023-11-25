package khai.dict.com.lecture6;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        referenceTypesExample();

        finalExample();

        finalScannerExample();

        stringMethodsExample();

        intArrayExample();

        floatArrayExample();

        arraysExample();

        scannerExample();

        shortForExample();
    }

    public static void referenceTypesExample() {
        int num = 1000;

        String myLang = "Java";
        String language = myLang;

        int a = 100;
        int b = a;

        String s1 = new String("Java");
        String s2 = new String("Java");
        String s3 = s2;

        System.out.println(s1 == s2);
        System.out.println(s2 == s3);

        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));

        String myStr = null;
        System.out.println(myStr);
        myStr = "Java";
        System.out.println(myStr);

        // int n = null;
    }

    public static void finalExample() {
        final long C = 3_00_000_000L;
        final double PI = 3.14;

        final StringBuilder builder = new StringBuilder();
        // builder = new StringBuilder();
        builder.append("Java");
        System.out.println(builder.toString());
    }

    public static void finalScannerExample() {
        final Scanner scanner = new Scanner(System.in);
        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        System.out.println(a + b);
    }

    public static void stringMethodsExample() {
        String emptyStr = "";
        String nullStr = null;
        String shortStr = "s";
        String javaStr = "Java";

        System.out.println(javaStr.length());
        System.out.println(javaStr.charAt(0));
        System.out.println(javaStr.charAt(3));
        System.out.println(javaStr.charAt(javaStr.length() - 1));
        System.out.println(javaStr.toUpperCase());
        System.out.println(javaStr.contains("av"));
        System.out.println(javaStr.replace("a", "*"));

        System.out.println(javaStr + " 17");
        System.out.println(javaStr.concat(" 17"));

        System.out.println(javaStr + 10 + true + "!!!!!");
    }

    public static void intArrayExample() {
        int[] array = { 1, 2, 3, 4, 5, 6 };
        System.out.println(Arrays.toString(array));

        int[] nums = new int[10];
        System.out.println(Arrays.toString(nums));
        nums[0] = 100;
        System.out.println(Arrays.toString(nums));
        System.out.println(nums[0]);
    }

    public static void floatArrayExample() {
        float[] nums;
        nums = new float[] { 1.99f, 0.001f, 0.5f };
        System.out.println(Arrays.toString(nums));
    }

    public static void arraysExample() {
        char[] chars = new char[10];
        Arrays.fill(chars, 0, 5, '*');
        Arrays.fill(chars, 5, 10, '%');
        System.out.println(Arrays.toString(chars));
        System.out.println(chars.length);

        int[] ints = new int[10];
        for (int i = 0; i < chars.length; i++) {
            ints[i] = chars[i] * 100;
        }
        System.out.println(Arrays.toString(ints));
    }

    public static void scannerExample() {
        Scanner scanner = new Scanner(System.in);

        int len = scanner.nextInt();
        int[] myArray = new int[len];

        for (int i = 0; i < len; i++) {
            myArray[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(myArray));
    }

    public static void shortForExample() {
        char[] chars = new char[10];
        Arrays.fill(chars, 0, 5, '*');
        Arrays.fill(chars, 5, 10, '%');
        System.out.println(Arrays.toString(chars));
        System.out.println(chars.length);

        for (char c : chars) {
            System.out.println(c);
        }
    }
}
