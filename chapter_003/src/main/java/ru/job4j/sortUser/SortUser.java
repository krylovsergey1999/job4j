package ru.job4j.sortUser;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortUser {
    public static Set<User> sort(List<User> list) {
        Set<User> set = new TreeSet<>(list);
        return set;
    }
}
