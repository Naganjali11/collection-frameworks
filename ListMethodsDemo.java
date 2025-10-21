package com.codegnan.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@SuppressWarnings("unused")
public class ListMethodsDemo {

    public static void main(String[] args) {
        List<String> cars = new ArrayList<String>();
        System.out.println("-------add()---------");
        cars.add("Toyota");
        cars.add("Honda");
        cars.add("Ford");
        System.out.println("Cars after add(): " + cars);

        System.out.println("-------add(int index, Object o)---------");
        cars.add(1, "BMW");
        System.out.println("Cars after add(1, BMW): " + cars);

        System.out.println("-------addAll(int index, Collection c)---------");
        Collection<String> moreCars = new ArrayList<String>();
        moreCars.add("Audi");
        moreCars.add("Chevrolet");
        cars.addAll(2, moreCars);
        System.out.println("Cars after addAll(2, moreCars): " + cars);

        System.out.println("-------get(int index)---------");
        System.out.println("Car at index 3: " + cars.get(3));

        System.out.println("-------remove(int index)---------");
        cars.remove(4);
        System.out.println("Cars after remove(4): " + cars);

        System.out.println("-------set(int index, Object new)---------");
        cars.set(0, "Tesla");
        System.out.println("Cars after set(0, Tesla): " + cars);

        System.out.println("-------indexOf(Object o)---------");
        System.out.println("Index of Ford: " + cars.indexOf("Ford"));

        System.out.println("-------lastIndexOf(Object o)---------");
        cars.add("BMW");
        System.out.println("Cars after adding BMW again: " + cars);
        System.out.println("Last index of BMW: " + cars.lastIndexOf("BMW"));

        System.out.println("-------listIterator()---------");
        ListIterator<String> listItr = cars.listIterator();
        System.out.println("ListIterator forward traversal:");
        while (listItr.hasNext()) {
            System.out.print(listItr.next() + " ");
        }
        System.out.println("\nListIterator backward traversal:");
        while (listItr.hasPrevious()) {
            System.out.print(listItr.previous() + " ");
        }

        System.out.println("\n-------clear()---------");
        cars.clear();
        System.out.println("Cars after clear(): " + cars);
        System.out.println("Is list empty after clear()? " + cars.isEmpty());
    }
}

