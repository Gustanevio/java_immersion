package test;

import java.util.*;

public class TestCollections {

    public static void main(String[] args) {

        // COLLECTION LIST
        list();

        //COLLECTION SET
        set();

        // COLLECTION MAP
        map();
    }

    public static void list() {
        List myList = new ArrayList();
        myList.add("Gustanevio");
        myList.add("Elton");
        myList.add("Stela");
        myList.add("Raquel");
        myList.add("Ayleen");
        myList.add("Vania");

        printCollections(myList, "LIST");
    }

    public static void set() {
        //we cannor duplicate elements, and the order do not matter
        Set mySet = new HashSet();
        mySet.add("Gustanevio");
        mySet.add("Elton");
        mySet.add("Stela");
        mySet.add("Raquel");
        mySet.add("Ayleen");
        mySet.add("Vania");
        printCollections(mySet, "SET");

    }

    public static void map() {
        Map myMap = new HashMap();
        myMap.put("value1", "Gustanevio");
        myMap.put("value2", "Ayleen");
        myMap.put("value3", "Stella");

        printCollections(myMap.keySet(), "MAP - PRINT KEYS");
        printCollections(myMap.values(), "MAP - PRINT VALUES");
//      retrieve single element
        String element = myMap.get("value1").toString();
        System.out.println("element = " + element);
    }

    public static void printCollections(Collection collection, String name) {
        System.out.println("-------------- " + name + " -----------------");
        // Using for loop
        for (Object element : collection) {
            System.out.println("Collection: " + element);
        }
        //Using foreach/lambda syntax
        collection.forEach(element -> {
            System.out.println("Collection: " + element);
        });

    }
}
