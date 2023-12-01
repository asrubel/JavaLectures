package khai.dict.com.lecture12;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        compareMutableVSImmutable();

        workingWithLists();

        workingWithSets();
    }

    public static void compareMutableVSImmutable() {
        List<String> emptyList = Collections.emptyList();
        Set<Integer> emptySet = Collections.emptySet();

        List<Integer> numList = new ArrayList<>();
        numList.add(1);
        numList.add(2);
        List<Integer> immutableList = Collections.unmodifiableList(numList);

        var numbers = new ArrayList<>(List.of(8, 2, 6, 4, 1, 3, 8, 5));
        Collections.sort(numbers);
        System.out.println(numbers);
        Collections.reverse(numbers);
        System.out.println(numbers);
        Collections.shuffle(numbers);
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);
        Collections.rotate(numbers, 3);
        System.out.println(numbers);

        System.out.println(Collections.min(numbers));
        System.out.println(Collections.max(numbers));
        System.out.println(Collections.frequency(numbers, 8));
    }

    public static void workingWithLists() {
        List<String> emptyList = List.of();
        List<String> titles = List.of("Java", "Kotlin", "Python");
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        /*emptyList.add("dfgdfgdfg");*/
        System.out.println(numbers.size());
        System.out.println(numbers.get(1));
        System.out.println(numbers.indexOf(4));

        List<Integer> mutableNumbers = new ArrayList<>(numbers);
        mutableNumbers.add(6);
        System.out.println(mutableNumbers);

        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        System.out.println(linkedList);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        for (Integer num : numbers) {
            System.out.println(num);
        }

        System.out.println(Objects.equals(List.of(1, 2, 3), List.of(1, 2, 3)));
        System.out.println(Objects.equals(List.of(1, 2, 3), List.of(1, 3, 2)));
        System.out.println(Objects.equals(List.of(1, 2, 3), List.of(1, 2, 3, 4)));
    }

    public static void workingWithSets() {
        Set<String> emptySet = Set.of();
        Set<String> languages = Set.of("Java", "Python", "JS");
        Set<Integer> integers = Set.of(100, 200, 300);

        Set<Integer> numbers = new HashSet<>(integers);
        numbers.add(300);
        numbers.add(300);
        numbers.add(200);

        System.out.println(integers);
        System.out.println(numbers);

        SortedSet<Integer> sortedSet = new TreeSet<>();
        sortedSet.add(10);
        sortedSet.add(7);
        sortedSet.add(15);
        sortedSet.add(10);
        sortedSet.add(8);
        System.out.println(sortedSet);
    }
}

class MyList implements List {

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {

    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}

class MySet implements Set {

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
