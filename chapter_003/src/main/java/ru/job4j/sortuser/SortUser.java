package ru.job4j.sortuser;

import java.util.*;

public class SortUser {
    public static Set<User> sort(List<User> list) {
        Set<User> set = new TreeSet<>(list);
        return set;
    }

    public static List<User> sortNameLength(List<User> list) {
        Comparator<User> comp = new LengthComparator();
        list.sort(comp);
        return list;
    }

    public static List<User> sortByAllFields(List<User> list) {
        Comparator<User> comp = new ByAllFieldsComparator();
        list.sort(comp);
        return list;
    }
}
