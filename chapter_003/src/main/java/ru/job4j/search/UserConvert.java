package ru.job4j.search;

import java.util.HashMap;
import java.util.List;

public class UserConvert {
    public HashMap<Integer, User> process(List<User> list) {
        HashMap<Integer, User> map = new HashMap<>();
        int ind = 0;
        for (User el : list) {
            map.put(el.getId(), el);
        }
        return map;
    }
}
