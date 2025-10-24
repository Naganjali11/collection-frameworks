package com.codegnan.collections;
import java.util.*;

public class StringLengthTreeSet {
    public static void main(String[] args) {
        // Custom Comparator to sort by length, then alphabetically
        Comparator<String> lengthThenAlpha = new Comparator<String>() {
            public int compare(String s1, String s2) {
                if (s1.length() != s2.length()) {
                    return s1.length() - s2.length();
                } else {
                    return s1.compareTo(s2);
                }
            }
        };

        TreeSet<String> set = new TreeSet<>(lengthThenAlpha);

        set.add("banana");
        set.add("apple");
        set.add("kiwi");
        set.add("pear");
        set.add("fig");
        set.add("date");

        for (String str : set) {
            System.out.println(str);
        }
    }
}
