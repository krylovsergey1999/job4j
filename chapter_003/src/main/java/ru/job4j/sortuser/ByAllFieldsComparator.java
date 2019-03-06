package ru.job4j.sortuser;

import java.util.Comparator;

public class ByAllFieldsComparator implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        int x = o1.getName().compareTo(o2.getName());
        if (x == 0) {
            int y = Integer.compare(o1.getAge(), o2.getAge());
            return y;
        } else {
            return x;
        }
    }
}
