package ru.job4j.search;

import java.util.ArrayList;
import java.util.List;

public class ConvertList {
    public List<Integer> convert(List<int[]> list) {
        List<Integer> l_arr = new ArrayList<>();
        for (int[] arr : list) {
            for (int elem : arr) {
                l_arr.add(elem);
            }
        }
        return l_arr;
    }
}
