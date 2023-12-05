package khai.dict.com.lecture13;

import java.util.*;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        tryForEach();

        tryIterators();

        tryMaps();
    }

    public static void tryForEach() {
        List<String> myList = List.of("Python", "Java", "C#");
        for (String element : myList) {
            System.out.println(element);
        }

        myList.forEach(System.out::println);

        Set<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(5);
        set.add(3);
        set.add(20);
        set.add(30);

        System.out.println(set);

        Iterator<Integer> iter = set.iterator();
        while (iter.hasNext()) {
            Integer current = iter.next();
            if (current < 10) {
                iter.remove();
            }
        }

        System.out.println(set);
    }

    public static void tryIterators() {
        List<Integer> list = List.of(1, 2, 3, 4);
        ListIterator<Integer> iterator = list.listIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        while (iterator.hasPrevious()) {
            int previousIndex = iterator.previousIndex();
            int previousElement = iterator.previous();
            System.out.println(previousElement + " on " + previousIndex);
        }
    }

    public static void tryMaps() {
        Map<String, Integer> emptyMap = Map.of();
        Map<String, Integer> groups = Map.of(
                "518", 9,
                "519", 15,
                "519a", 16,
                "519st", 18,
                "518st", 5
        );
        System.out.println(groups.size());
        System.out.println(groups.get("518"));
        System.out.println(groups.getOrDefault("539", 0));
        System.out.println(groups.keySet());
        System.out.println(groups.values());

        Map<Integer, String> products = new HashMap<>();
        products.put(1000, "Laptops");
        products.put(2000, "Monitors");
        products.put(3000, "SmartPhones");

        System.out.println(products);
        System.out.println(products.get(1000));

        products.remove(1000);
        System.out.println(products.get(1000));

        products.putIfAbsent(3000, "Keyboards");
        System.out.println(products.get(3000));
    }
}

class MyCollection<T> implements Iterable<T> {
    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<T> spliterator() {
        return Iterable.super.spliterator();
    }
}
