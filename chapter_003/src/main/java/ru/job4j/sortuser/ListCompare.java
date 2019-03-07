package ru.job4j.sortuser;

import java.util.Comparator;


public class ListCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int l = left.length();
        int r = right.length();
        final int min_size = l < r ? l : r;
        for (int i = 0; i < min_size; i++) {
            int res = Character.compare(left.charAt(i), right.charAt(i));
            if (res != 0) {
                return res;
            }
        }
        if (l == r) {
            return 0;
        }
        if (l > r) {
            return 1;
        } else {
            return -1;
        }
    }
}
