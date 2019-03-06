package ru.job4j.sortuser;

import java.util.Comparator;

public class LengthComparator implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        return o1.getName().length() - o2.getName().length();
    }
}
